package Youtube.apnaCollege.Recursion.problems;

public class Move_all_X_to_the_End {

	private static String moveAllX(String str, int idx, int count, String newString) {
		if(idx == str.length()) {
			for(int i = 0; i < count; i++) {
				newString += 'x';
			}
			return newString;
		}
		
		if(str.charAt(idx) == 'x') {
			count++;
		} else {
			newString += str.charAt(idx);
		}
		return moveAllX(str, ++idx, count, newString);
	}
	
	
	public static void main(String[] args) {
		String s = "axbcxxdx";
		String res = moveAllX(s, 0, 0, "");
		System.out.println(res);
	}
}
