package testM;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sandalen.redis.JedisClient;

public class Tredis {
	
	public static void main()
	{
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
		JedisClient jedisClient = applicationContext.getBean(JedisClient.class);
		jedisClient.set("first", "100");
		String result = jedisClient.get("first");
		System.out.println(result);
	
		
	}
}
