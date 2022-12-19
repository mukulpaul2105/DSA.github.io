package mediam;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Chars_03 {
	
	private static int LengthOfSubStr(String str) {
		
		if(str.length() == 0) return 0;
		
		int start = 0, end = 0, maxLength = 0;
		Set<Character> uniqueChar = new HashSet<>();
		while(end < str.length()) {
			if(!uniqueChar.contains(str.charAt(end))) {
				uniqueChar.add(str.charAt(end));
				end++;
				maxLength = Math.max(maxLength, uniqueChar.size());
			} else {
				uniqueChar.remove(str.charAt(start));
				start++;
			}
		}
		
		return maxLength;
	}
	
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(LengthOfSubStr(s));
	}

}
