package controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sandalen.CF.CommonUse;
import com.sandalen.CF.GetCommoUse;
import com.sandalen.CF.GetRecommend;
import com.sandalen.CF.GetSimilarity;
import com.sandalen.CF.ItemSimilarity;
import com.sandalen.CF.RecommendItem;

import model.RecentUser;
import model.ResultMap;
import model.Topic;
import model.User;
import model.UserDetailed;
import model.Userrecord;
import service.TopicService;
import service.UserRecordService;
import service.UserService;

@Controller
public class UserController {
	@Autowired
	private TopicService topicService;
	@Autowired
	private UserService userService;
	@Autowired
	private UserRecordService urs;

	@RequestMapping("/user/detail/{userId}")
	public String showUserDetail(@PathVariable Integer userId, Model model) {
		System.out.println(userId);
		UserDetailed userDetailed = userService.getUserDetailed(userId);
		model.addAttribute("info", userDetailed);
		Userrecord userRecord = urs.getUserRecord(userId);
		/*
		 * List<Topic> topics = topicService.getTopicByUserId(userId);
		 * model.addAttribute("topicInfo", topics);
		 */
		model.addAttribute("userRecord", userRecord);
		System.out.println("idsRecord is" + userRecord.getIdsrecord());
		SparkConf conf = new SparkConf();
		conf.setAppName("cfByJava");
		conf.setMaster("local[4]");
		JavaSparkContext sc = new JavaSparkContext(conf);
		JavaRDD<String> c_rdd = sc.textFile("C:\\Users\\dell\\Desktop\\java\\collect_of_monitorData\\1.txt");
		JavaRDD<String> t_rdd = sc.textFile("C:\\Users\\dell\\Desktop\\java\\collect_of_monitorData\\cf.txt");

		// 获取常用物品
		List<CommonUse> commonUse = GetCommoUse.getCommonUse(c_rdd);

		// 获取物品相似度
		JavaRDD<ItemSimilarity> similarity = GetSimilarity.getSimilarity(t_rdd);
		System.out.println(similarity.collect());

		JavaRDD<CommonUse> common_use = sc.parallelize(commonUse);
		// 获取推荐
		JavaRDD<List<RecommendItem>> rec_rdd = GetRecommend.GetRecommend(common_use, similarity, 2);
		
		List<RecommendItem> recommend = new ArrayList<>();
		for(List<RecommendItem> list : rec_rdd.collect())
		{
			for(RecommendItem item : list)
			{
				list.add(item);
			}
		}
		model.addAttribute("reco", recommend);
	
		return "userInfo";
	}

	@RequestMapping("/queryAll")
	@ResponseBody
	public ResultMap<List<RecentUser>> queryAll() {
		List<RecentUser> recentUser = userService.getRecentUser();
		int count = 5;

		return new ResultMap<List<RecentUser>>("", recentUser, 0, count);
	}

	@RequestMapping("skip")
	public String skip() {
		return "fast";
	}

	@RequestMapping("skip2")
	public String skip2() {
		return "\\ForumOfSandalen\\src\\main\\webapp\\firstLayUi.jsp";
	}

	@RequestMapping("re")
	public String re() {
		return "loginM.jsp";
	}

}
