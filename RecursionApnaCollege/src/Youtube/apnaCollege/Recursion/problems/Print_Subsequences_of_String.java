package Youtube.apnaCollege.Recursion.problems;

import java.util.HashSet;
import java.util.Set;

public class Print_Subsequences_of_String {
	
	public static void subsequence(String str, int idx, String newStr) {
		if(idx == str.length()) {
			System.out.println(newStr);
			return;
		}
		
		char currChar = str.charAt(idx);
		
		// To be
		subsequence(str, idx + 1, newStr + currChar);
		
		// or not to be
		subsequence(str, idx + 1, newStr);
	}
	
	
	public static void subsequence(String str, int idx, String newStr, HashSet<String> set) {
		if(idx == str.length()) {
			if(set.contains(newStr)) {
				return;
			} else {
				System.out.println(newStr);
				set.add(newStr);
				return;
			}
		}
		
		char currChar = str.charAt(idx);
		
		// To be
		subsequence(str, idx + 1, newStr + currChar, set);
		
		// or not to be
		subsequence(str, idx + 1, newStr, set);
	}
	
	
	public static void main(String[] args) {
		
		String str = "abc";
		subsequence(str, 0, "");
		System.out.println("==============================================");
		
		// If string has duplicate characters
		String s = "aaa";
		HashSet<String> set = new HashSet<>();
		ss(str, 0, "", set);
		
		
	}
	
	public static void ss(String str, int idx, String ns, Set<String> set) {
		if(idx == str.length()) {
			if(set.contains(ns)) {
				return;
			} else {
				set.add(ns);
				System.out.println(ns);
				return;
			}
		}
		char c = str.charAt(idx);
		ss(str, idx + 1, ns + c, set);
		ss(str, idx + 1, ns, set);
	}

}
