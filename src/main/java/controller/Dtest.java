package controller;

import java.util.ArrayList;
import java.util.List;

public class Dtest {

	public static void main() {
		
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.removeAll(list1);
		System.out.println(list2);
		
	}
}
