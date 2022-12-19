package Youtube.apnaCollege.Recursion.problems;

public class First_and_Last_Occurance {
	
	private static int first = -1;
	private static int last = -1;

	private static void firstAndLastOccurance(String str, int idx, char element) {
		if(idx == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return; 
		}
		
		char currChar = str.charAt(idx);
		if(currChar == element) {
			if(first == -1) {
				first = idx;
			} else {
				last = idx;
			}
		}
		
		firstAndLastOccurance(str, idx + 1, element);
	}
	
	
	
	public static void main(String[] args) {
		String s = "abaacdaefaah";
		firstAndLastOccurance(s, 0, 'a');
	}
}
