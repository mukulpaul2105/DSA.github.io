package Geekster.ExtraProblems;

/*
 *  Check whether the given String contains unique character or not
 *  
 *  We can have multiple approach to solve this problem
 */
public class UniqueCharset {

	/*
	 * Convert the String into charSet then
	 * 
	 * 1. Run two nested for loop and check. TC: O(n^2)
	 * 2. Sort the Array and check adjucent. TC: O(nlog(n)
	 * 3. Frequency Array. ----------------> TC: O(n)
	 */
	
	// 3. Frequency Array
	public static boolean checkUniquechar(String str) {
		int[] freqArr = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			freqArr[str.charAt(i) - 'a']++;
			
		}
		
		 
		for(int i = 0; i < freqArr.length; i++) {
			if(freqArr[i] > 1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "letcod";
		System.out.println(checkUniquechar(str));
	}
	
}
