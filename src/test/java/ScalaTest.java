import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ScalaTest {
	@Test
	public void quchong()
	{
		List list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(1);
		
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=0;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
				{
					list.remove(list.get(i));
					i--;
				}
			}
		}
		
		System.out.println(list.toString());
	}
	  
}
