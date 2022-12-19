package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
 * 884. Uncommon Words from Two Sentences
Easy

1044

149

Add to List

Share
A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

 

Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]
 

Constraints:

1 <= s1.length, s2.length <= 200
s1 and s2 consist of lowercase English letters and spaces.
s1 and s2 do not have leading or trailing spaces.
All the words in s1 and s2 are separated by a single space.
 */

public class UncommonWordsfromTwoSentences884 {
	
	 public static String[] uncommonFromSentences(String s1, String s2) {
	     
		 String newString = s1 + " " + s2;
		 HashMap<String, Integer> hm = new HashMap<>();
		 
		 for(var word : newString.split(" ")) {
			 hm.put(word,  hm.getOrDefault(word, 0) + 1);
		 }
		 
		 List<String> list = new ArrayList<>();
		 for(var entry : hm.entrySet() ) {
			 if(entry.getValue() == 1) {
				 list.add(entry.getKey());
			 }
		 }
		 
//		 String[] result = new String[list.size()];
//		 for(int i = 0; i < list.size(); i++) {
//			 result[i] = list.get(i);
//		 }
		 
		 return list.stream().toArray(String[] :: new);
	 }
	 
	 
	 public static void main(String[] args) {
		String s1 = "this apple is sweet", s2 = "this apple is sour";
		String res[] = uncommonFromSentences(s1,s2);
		for(var s : res) {
			System.out.println(s);
		}
	}
}
