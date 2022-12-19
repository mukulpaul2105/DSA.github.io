package Geekster.O1.Sorting;

import java.util.Arrays;

public class SortingAnStringUsingArraysSort {
	
	public static void main(String[] args) {
		
		String s = "Arun";
		String t = "urnxA";
		
		char[] charS = s.toCharArray();
		char[] charT = t.toCharArray();
		
		if(charS.length != charT.length ) {
			System.out.println(false);
			
		} else {
			Arrays.sort(charS);
			Arrays.sort(charT);
			
			for(int i = 0; i < charS.length; i++) {
				if(charS[i] != charT[i]) {
					System.out.println(false);
					break;
				}
			}

			System.out.println(true);
		}
		
		
		
	}

}
