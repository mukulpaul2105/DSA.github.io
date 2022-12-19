package Youtube.apnaCollege.Recursion.problems;

public class Remove_Duplicates {

	private static boolean[] map = new boolean[26];
	
	private static String removeDuplicates(String str, int idx, String newString) {
		
		if(idx == str.length()) {
			return newString;
		}
		
		char currChar = str.charAt(idx);
		if(map[currChar - 'a']  == false) {
			newString += currChar;
			map[currChar - 'a'] = true;
		}
		return removeDuplicates(str, ++idx, newString);
	}
	
	
	public static void main(String[] args) {
		String s = "abbccda";
		String res = removeDuplicates(s, 0, "");
		System.out.println(res);
	}
	
}
