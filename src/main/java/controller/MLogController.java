package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sandalen.CF.CommonUse;
import com.sandalen.CF.GetCommoUse;
import com.sandalen.CF.GetRecommend;
import com.sandalen.CF.GetSimilarity;
import com.sandalen.CF.ItemSimilarity;
import com.sandalen.CF.RecommendItem;

import model.Equipment;
import model.User;
import model.UserDetailed;
import model.Userrecord;
import service.EquipmentService;
import service.UserRecordService;
import service.UserService;
import util.CookieUtils;

@Controller
public class MLogController {
	@Autowired
	private EquipmentService es;
	@Autowired
	private UserService userService;
	@Autowired
	private UserRecordService urs;
	@RequestMapping(value="/muser/login")
	public String showLogin()
	{
		return "Mlogin";
	}
	
	@ResponseBody
	@RequestMapping(value="/checkMuser",method= RequestMethod.POST)
	public boolean checkMuser(@RequestBody @RequestParam("uname") String uname)
	{
		User user = userService.checkUser(uname);
		if(user!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@ResponseBody
	@RequestMapping(value="/checkLog",method= RequestMethod.POST)
	public int checkLog(@RequestBody @RequestParam("uname") String uname,@RequestParam("pwd") String pwd)
	{
		User user = userService.checkUser(uname);
		System.out.println("checkLog has been entered");
		if(user==null)
		{
			return 1;
		}
		if(!user.getPassword().equals(pwd))
		{
			return 2;
		}
		if(user.getLocked()==1)
		{
			return 3;
		}
		return 0;
	}
	

	@RequestMapping(value="/logSuc",method= RequestMethod.POST)
	public String logSuc(String username,HttpServletRequest request,HttpServletResponse response,Model model)
	{
		System.out.println("???????");
		User user = userService.checkUser(username);
		request.getSession().setAttribute("user", user);
		Integer uid = user.getUserId();

		Cookie cookie = CookieUtils.getCookieByName(uid+"lastTime", request.getCookies());
		System.out.println(cookie);
		if(cookie ==null)
		{
			request.getSession().setAttribute("notice", "您是第一次访问");
		}
		else
		{
			String value = cookie.getValue();
			System.out.println(value);
			request.getSession().setAttribute("notice", "你的上一次访问时间为:"+value);
		}
		cookie = new Cookie(uid+"lastTime",new Date()+" ");
		cookie.setMaxAge(3600);
		cookie.setPath(request.getContextPath()+"/");
		response.addCookie(cookie);
		return "redirect:/showIndex";
		
	}	
	@RequestMapping("/showIndex")
	public String showIndex() {
		return "/index";
	}
	
	@RequestMapping(value="/muser/detail/{userId}", method=RequestMethod.GET)
	public String muserDetailed(@PathVariable int userId,Model model,HttpServletRequest request)
	{
		String username= userService.getUserById(userId).getUserName();
		UserDetailed userDetailed = userService.getUserDetailed(userId);
		Userrecord userRecord = urs.getUserRecord(userId);
		model.addAttribute("info", userDetailed);
		model.addAttribute("username", username);
		String ids = "";
		List<Equipment> equip = new ArrayList<>();
		System.out.println(userRecord);
		if(userRecord!=null)
		{
			if(userRecord.getRecommend().equals("") || userRecord.getRecommend()==null)
			{
				List<Equipment> list = this.getRecommendEquip(request);
				Random r = new Random();
				for(int i=0;i<1;i++)
				{
					int random = r.nextInt(list.size());
					equip.add(list.get(random));
					list.remove(list.get(random));
				}
				
				for(Equipment eu:list)
				{
					ids+=eu.getEid()+"-";
				}
				ids = ids.substring(0,ids.length()-1);
				userRecord.setRecommend(ids);
				urs.updateUserRecord(userRecord);
				
				
			}
			else
			{
				System.out.println("recommond不为空");
				String recommend = userRecord.getRecommend();
				System.out.println("recommend is"+recommend);
				String[] strs = recommend.split("-");
				
				
				System.out.println(strs.toString());
				List<String> asList = Arrays.asList(strs);
				LinkedList<String> linkedList = new LinkedList<>(asList);
				System.out.println("asList before is" + asList.toString());
				Random r = new Random();
				for(int i=0;i<1;i++)
				{
					int random = r.nextInt(linkedList.size());
					System.out.println("random is " +random);
					Equipment equipment = es.getSingleEquipment(Long.parseLong(linkedList.get(random)));
					equip.add(equipment);
					long l = Long.parseLong(linkedList.get(random));
					System.out.println("l is"+l);
					linkedList.remove(random);
					System.out.println("asList after is"+linkedList.toString());
				}
				System.out.println(linkedList.toString());
				if(linkedList!=null && linkedList.size()>0)
				{
					for(String st : linkedList)
					{
						ids += st +"-";
					}
					ids = ids.substring(0,ids.length()-1);
				}
			
				System.out.println("after ids is"+ids);
				userRecord.setRecommend(ids);
				urs.updateUserRecord(userRecord);
				
			}
		}
		model.addAttribute("userRecord", userRecord);
		model.addAttribute("equips", equip);
		return "userDetailed";
		
	}
	
	public List<Equipment> getRecommendEquip(HttpServletRequest request)
	{
		User user = (User)request.getSession().getAttribute("user");
		Integer userId = user.getUserId();
		SparkConf conf = new SparkConf();
		conf.setAppName("cfByJava");
		conf.setMaster("local[4]");
		JavaSparkContext sc = new JavaSparkContext(conf);
		JavaRDD<String> c_rdd = sc.textFile("C:\\Users\\dell\\Desktop\\java\\collect_of_monitorData\\"+userId+".txt");
		JavaRDD<String> t_rdd = sc.textFile("C:\\Users\\dell\\Desktop\\java\\collect_of_monitorData\\cf.txt");
		JavaRDD<String> distinct = t_rdd.distinct();
		// 获取常用物品
		List<CommonUse> commonUse = GetCommoUse.getCommonUse(c_rdd);

		// 获取物品相似度
		JavaRDD<ItemSimilarity> similarity = GetSimilarity.getSimilarity(distinct);
		System.out.println(similarity.collect());

		JavaRDD<CommonUse> common_use = sc.parallelize(commonUse);
		// 获取推荐
		JavaRDD<List<RecommendItem>> rec_rdd = GetRecommend.GetRecommend(common_use, similarity, 3);
		
		List<RecommendItem> recommend = new ArrayList<>();
		List<List<RecommendItem>> list2 = rec_rdd.collect();
		for(int i=0;i<list2.size();i++)
		{
			List<RecommendItem> item = list2.get(i);
			for(int j=0;j<item.size();j++)
			{
				recommend.add(item.get(j));
			}
		}
		
		
		TreeSet<Long> treeSet = new TreeSet<>();
		for(RecommendItem item : recommend)
		{
			treeSet.add(Long.parseLong(item.getItemid()));
		}
		
		
		System.out.println(treeSet.toString());
		List<Equipment> equip = new ArrayList<>();
		for(Long id : treeSet)
		{
			Equipment equipment = es.getSingleEquipment(id);
			equip.add(equipment);
		}
		sc.stop();
		return equip;
	}
		
}
