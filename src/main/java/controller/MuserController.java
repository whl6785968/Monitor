package controller;

import java.io.UnsupportedEncodingException;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ReportAsSingleViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Muser;
import model.MuserExample;
import model.MuserExample.Criteria;
import model.RecentUser;
import model.ResultMap;
import model.Topic;
import model.User;
import model.UserDetailed;
import service.MuserService;
import service.TopicService;
import service.UserService;
import util.EncodingUtil;

@Controller
public class MuserController {

	@Autowired
	private MuserService muserService;
	@Autowired
	private UserService userService;
	/*@RequestMapping("/user/detail/{userId}")
	public String showUserDetail(@PathVariable Integer userId,Model model)
	{
		System.out.println(userId);
		UserDetailed userDetailed = userService.getUserDetailed(userId);
		model.addAttribute("info", userDetailed);
		List<Topic> topics = topicService.getTopicByUserId(userId);
		model.addAttribute("topicInfo", topics);
		return "userInfo";
	}*/
	
	@ResponseBody
	@RequestMapping(value="/queryAll",produces = "application/json; charset=utf-8")
	public ResultMap<List<Muser>> queryAll() throws UnsupportedEncodingException
	{
		MuserExample example = new MuserExample();
		/*Criteria criteria = example.createCriteria();*/
		/*if(text != null)
		{
			criteria.andIdEqualTo(text);
		}*/
		
		List<Muser> allMuser = muserService.getAllMuser(example);
		int count = muserService.getMuserCount(example);
		System.out.println(count);
//		int count = 5;
		for(Muser user:allMuser)
		{
			System.out.println(user.getMname());
		}
		return new ResultMap<List<Muser>>(" ",allMuser,0,count);
	}
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(String id,String mname,String mdate,String auth,String email,String links,String others) throws UnsupportedEncodingException
	{
		Muser muser = new Muser();
		muser.setId(id);
		muser.setMname(EncodingUtil.encoding(mname));
		muser.setMdate(mdate);
		muser.setAuth(auth);
		muser.setEmail(email);
		muser.setLinks(links);
		if(others!=null)
		{
			muser.setOthers(EncodingUtil.encoding(others));
			System.out.println(others);
		}
		
		
		muserService.inserMuser(muser);
		
		return "redirect:/index";
	}
	@ResponseBody
	@RequestMapping(value="/deleteUser", method=RequestMethod.POST)
	public Integer deleteUser(@RequestBody @RequestParam("id") String id)
	{
		System.out.println("delete！！！！！！！！！！！！！！！！！");
		muserService.deleteUser(id);
		
		return 1;
	}
	@ResponseBody
	@RequestMapping(value="/addUser2",method=RequestMethod.POST)
	public boolean addUser2(@RequestBody Muser muser)
	{
		System.out.println("ADD=============================");
		muserService.inserMuser(muser);
		return true;
	}
	
	@RequestMapping("/toUpdate")
	public String toUpdate(String id,String mname,String mdate,String auth,String email,
			String links,String others,Model model) throws UnsupportedEncodingException
	{
		mname = EncodingUtil.encoding(mname);
		model.addAttribute("id",id);
		model.addAttribute("mname", mname);
		model.addAttribute("mdate", mdate);
		model.addAttribute("auth", auth);
		model.addAttribute("email", email);
		model.addAttribute("links", links);
		model.addAttribute("others", others);
	
	
		return "/updateUser";
	}
	@ResponseBody
	@RequestMapping("/searchUser")
	public ResultMap<List<Muser>> searchUser(@RequestBody @RequestParam("id") String id)
	{
		System.out.println(id);
		MuserExample example = new MuserExample();
		Criteria criteria = example.createCriteria();
		if(id != null)
		{
			criteria.andIdEqualTo(id);
		}
		List<Muser> musers = muserService.getAllMuser(example);
		int count = muserService.getMuserCount(example);
		return new ResultMap<List<Muser>>(" ",musers,0,count);
	}
	@ResponseBody
	@RequestMapping("/checkUser")
	public Muser checkUser(@RequestBody @RequestParam("id") String id)
	{
		Muser muser = muserService.getMuser(id);
		return muser;
	}
	@ResponseBody
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public boolean updateUser(@RequestBody Muser muser) {
		System.out.println("修改用户");
		muserService.updateUser(muser);
		return true;
	}
	
	@ResponseBody
	@RequestMapping(value="/test11",method=RequestMethod.POST)
	public boolean testt(@RequestBody Muser muser)
	{
		System.out.println(muser.getMname());
		muserService.inserMuser(muser);
		System.out.println("接收到请求了");
		return true;
	}
	
	@ResponseBody
	@RequestMapping(value="/updateMuser",method=RequestMethod.POST)
	public boolean updateMuser1(@RequestParam("uid") Integer uid,@RequestParam("email") String email ,
			@RequestParam("phoneNumber") String phoneNumber,@RequestParam("userSignature") String userSignature)
	{
		System.out.println(uid);
		System.out.println(email);
		System.out.println(phoneNumber);
		UserDetailed detailed = userService.getUserDetailed(uid);
		
		
		detailed.seteMail(email);
		detailed.setPhoneNumber(phoneNumber);
		detailed.setUserSignature(userSignature);
		userService.updateUser(detailed);
		System.out.println("我在运行哦");
		return true;
		
		
	}
	
   @RequestMapping("/showControlAuth")
   public String showControlAuth() {
	   return "authorizeControl";
   }
   @ResponseBody
	@RequestMapping(value="/control")
	public ResultMap<List<User>> control() throws UnsupportedEncodingException
	{
	   List<User> allUser = userService.getAllUser();
	   for(User u : allUser)
	   {
		   System.out.println(u.getUserName());
	   }
		int userCount = userService.getUserCount();
		return new ResultMap<List<User>>(" ",allUser,0,userCount);
	}
   
   @RequestMapping(value="/toSetting")
	public String toSetting(Integer userId,String userName,Byte userType,Byte locked,Integer credit,
			Model model) throws UnsupportedEncodingException
	{
	   userName = EncodingUtil.encoding(userName);
		model.addAttribute("userId",userId);
		model.addAttribute("userName", userName);
		model.addAttribute("userType", userType);
		model.addAttribute("locked", locked);
		model.addAttribute("credit", credit);

	
	
		return "userSetting";
	}
   
   @ResponseBody
   @RequestMapping(value="/setting",method=RequestMethod.POST)
   public boolean setting(Integer id,String name,Byte auth,Byte state,Integer credit)
   {
	   User user = userService.getUserById(id);
	   user.setUserName(name);
	   user.setUserType(auth);
	   System.out.println("auth is"+auth);
	   user.setLocked(state);
	   System.out.println("state is"+state);
	   user.setCredit(credit);
	   userService.settingUser(user);
	   return true;
   }
   
   @RequestMapping("/nlogout")
   public String logout(HttpServletRequest request) {
	   request.getSession().setAttribute("user", null);
	   return "Mlogin";
   }
	
}
