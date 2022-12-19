package Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Group_Anagram_49 {
	
	private static String sortString(String s) {
		int[] fa = new int[26];
		for(int i = 0; i < s.length(); i++) {
			fa[s.charAt(i) - 'a']++;
		}
		
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < 26; i++) {
			while(fa[i] > 0) {
				res.append((char)(i + 'a'));
				fa[i]--;
			}
		}
		return res.toString();
	}
	
	 public static List<List<String>> groupAnagrams(String[] strs) {
		 HashMap<String, List<String>> hm = new HashMap<>();
		 
		 for(String str : strs) {
			 String sortedStr = sortString(str);
			 if(!hm.containsKey(sortedStr)) {
				 hm.put(sortedStr, new LinkedList<String>());
			 }
			 hm.get(sortedStr).add(str);
		 }
		 return new ArrayList<List<String>>(hm.values());
	 }
	
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> l = groupAnagrams(strs);
		System.out.println(l);
	
	}

}
