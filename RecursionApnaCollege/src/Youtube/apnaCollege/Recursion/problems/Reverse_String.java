package Youtube.apnaCollege.Recursion.problems;

public class Reverse_String {

	private static void reverseString(String str, int idx) {
		if(idx == 0) {
			System.out.print(str.charAt(idx));
			return;
		}
		System.out.print(str.charAt(idx));
		reverseString(str, idx - 1);
	}
	
	public static void main(String[] args) {
		String s = "abcd";
		reverseString(s, s.length() - 1);
	}
}
