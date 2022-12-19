package Geekster.HashMap.Practice;

import java.util.HashMap;
import java.util.List;

/*
 *  Input: {"cat", "tac", "eat", "dog", "tea"};
 *  
 *  hashMap: ("cat", {"cat", "tac","atc"})
 *  		 ("dog", hm.get("dog") ---> value arrayOfString[] if it's size > 1 then print anagrams--->
 *  		 ("eat", {"eat", "tea"})
 */

public class FindAnagrams {
	
	private static void findAnagrams(String arr[]) {
		HashMap<String, List<String>> hm = new HashMap<>();
		/*
		 * ("a", {"abc", "adc"})
		 * ("b", {"xyz", "mnp"})
		 */
		
	}
	
	
	public static void main(String[] args) {
		String[] arr = {"cat", "tac", "eat", "dog", "tea"};
		findAnagrams(arr);
	}

}
