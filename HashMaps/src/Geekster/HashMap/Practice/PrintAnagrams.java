package Geekster.HashMap.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintAnagrams {

	public static void printAnagrams(String arr[] ) {
		HashMap<String, List<String>> hm = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			String w = arr[i];
			char[] l = w.toCharArray();
			Arrays.sort(l);
			String w2 = new String(l);
			
			if(hm.containsKey(w2)) {
				hm.get(w2).add(w); //Fetching some list and adding some value
			} else {
				List<String> list = new ArrayList<>();
				list.add(w);
				hm.put(w2, list);
			}
		}
		
//		for(var s : hm.keySet()) {
//			List<String> v = hm.get(s);
//			if(v.size() > 1) {
//				System.out.println(v);
//			}
//		}
		// 		Or
		
		for(var entry : hm.entrySet()) {
			List<String> list = entry.getValue();
			if(list.size() > 1) {
				System.out.println(list);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] s = {"arun", "kamal", "lakam", "simmi", "misim", "naru", "mimis"};
		printAnagrams(s);
	}
}
