

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sandalen.redis.JedisClient;

public class Tredis {
	@Test
	public void tredis()
	{
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
		JedisClient jedisClient = applicationContext.getBean(JedisClient.class);
		jedisClient.set("first", "100");
		String result = jedisClient.get("first");
		System.out.println(result);
	
		
	}
}
