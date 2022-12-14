package Easy;

/*
 *  An Anagram is a word or phrase formed by rearranging the letters of a different word
 *  or phrase, typically using all the original letters exactly once.
 */

/*
 * Approaches
 * 1. Sort two arrays and check both are equal or not but TC: O(nlogn)
 * 2. Using Frequency Array 
 * 		Create 
 */
public class ValidAnagram242 {

	public static boolean isAnagram(String s, String t) {

		if(s.length() != t.length()) {
			return false;
		}

		int[] fa1 = new int[26];
//		int[] fa2 = new int[26];


		//		for(int i = 0; i < s.length(); i++) {
		//			fa1[s.charAt(i) - 'a']++;
		//			fa2[t.charAt(i) - 'a']++;
		//		}
		//
		//		for(int i = 0; i < 26; i++) {
		//			if(fa1[i] != fa2[i]) {
		//				return false;
		//			}
		//		}
		/*
		 * 						OR
		 */
		for(int i = 0; i < s.length(); i++) {
			fa1[s.charAt(i) - 'a']++;
		}
		 
		for(int i = 0; i < t.length(); i++) {
			if(fa1[t.charAt(i) - 'a'] <= 0) {
				System.out.println(t.charAt(i));
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s1 = "ardun";
		String s2 = "ardunk";
		System.out.println(isAnagram(s1, s2));
	}

}
