package Geekster.O1.LinkedList;

import java.util.LinkedList;

public class InbuiltLL {
	
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<>();
		l.add("Simmi");
		l.add("Kabir");
		l.add("Jay");
		
//		System.out.println(l);
		
//		for(String s : l) {
//			System.out.println(s);
//		}
		
		LinkedList<String> l2 = new LinkedList<>();
		l2.add("Kunal");
		l2.add("Ramesh");
		
		l2.addAll(l);
		
		System.out.println(l2);
		
	}

}
