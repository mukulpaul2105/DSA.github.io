package Geekster.O2.SubString;

import java.util.Scanner;

public class GeneratingAllSubstring {

	public static void generateAllSubstring(String s) {
		for(int i = 0; i < s.length(); i++) {

			StringBuilder subStr = new StringBuilder();
			for(int j = i; j < s.length(); j++) {
				subStr.append(s.charAt(j));
				System.out.println(subStr);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		String s = "abc";
//		generateAllSubstring(s);
	}
}
