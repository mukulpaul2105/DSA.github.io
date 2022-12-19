package Easy;

import java.util.HashMap;
import java.util.Map;

/*
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
 */

/*
 * Approaches 
 */

public class JewelsAndStones771 {

	public static int jwelsAndStones(String jewels, String stones) {
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(var c : jewels.toCharArray()) {
			hm.put(c, 0);
		}
		
		int count = 0;
		for(char c : stones.toCharArray()) {
			if(hm.getOrDefault(c, -1) == 0) {
				count++;
			}
		}
		return count;
		
	}
	
	
	
	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		
		System.out.println(jwelsAndStones(jewels, stones));
		
		HashMap<String, Integer> m = new HashMap<>();
		m.put("A", 1);
		m.put("B", 2);
		m.put("B", 3);
		
		System.out.println("============================================================");
		
		for(var e : m.entrySet()) {
//			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}
	
	 

}








