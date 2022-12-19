package Geekster.O1.Sorting;
/*
 * We can have multiple approaches
 * 1. Using Arrays.sort() but the TC will be: O(n^2)
 * 2. Using Frequency Array
 */
public class SortString {
	
	// Using Frequency Array
	public static String sortString(String str) {
		int[] freqArr = new int[26];
		
		// Character to Index
		for(int i = 0; i < str.length(); i++) {
			freqArr[str.charAt(i) - 'a']++;
		}
		
		
		// Index to Character
		String result = new String();
		for(int i = 0; i < 26; i++) {
			while(freqArr[i] > 0) {
				// Generating the sorted String as output
				result += (char)(i + 'a');
				freqArr[i]--;
			}
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		String str = "leetcode";
		System.out.println(sortString(str));
		
	}

}
