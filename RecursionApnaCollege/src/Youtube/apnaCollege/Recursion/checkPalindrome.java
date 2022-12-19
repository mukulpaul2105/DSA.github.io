package Youtube.apnaCollege.Recursion;

public class checkPalindrome {
	
	private static void subsec(String s, int idx, String res) {
		if(idx >= s.length()) {
			System.out.println(res);
			return;
		}

		char c = s.charAt(idx);
		subsec(s, idx + 1, res + c);
		subsec(s, idx + 1, res);

	}
	
	private static boolean isPalindrome(String str, int left, int right) {
		if(left >= right) return true;
		if(str.charAt(right) != str.charAt(left)) return false;
		return isPalindrome(str, left + 1, right - 1);
	}

	public static void main(String[] args) {
		String s = "raceecar";
//		boolean res = isPalindrome(s, 0, s.length() - 1);
		subsec("abc", 0, "");
	}
}
