package Youtube.apnaCollege.Recursion.Advanced;

public class Permutation_String {
	
	private static void printPerm(String str, String permutation) {
		
		if(str.length() == 0) {
			System.out.println(permutation);
		}
		
		for(int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			// "abc" -> "ab"
			String newStr = str.substring(0, i) + str.substring(i + 1);
			printPerm(newStr, permutation + currChar);
		}
	}
	
	private static void printPermut(String str, String p) {
		if(str.length() == 0) {
			System.out.println(p);
		}
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			String ns = str.substring(0, i) + str.substring(i + 1);
			printPermut(ns, p + c);
		}
	}

	
	
	public static void main(String[] args) {
		String str = "abc";
//		printPerm(str, "");
		printPermut(str, "");
		
	}
}
