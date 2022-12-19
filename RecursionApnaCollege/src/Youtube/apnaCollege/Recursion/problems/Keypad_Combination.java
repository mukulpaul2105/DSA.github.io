package Youtube.apnaCollege.Recursion.problems;

public class Keypad_Combination {
	
	private static String[] keypad = {".", "abc","def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
	
	
	private static void printComb(String str, int idx, String combination) {
		if(idx == str.length()) {
			System.out.println(combination);
			return;
		}
		
		// Storing index from given string to fetch string stored in keypad
		char currChar = str.charAt(idx);
		
		// Storing String in mapping from keypad at index idx
		String mapping = keypad[currChar - '0'];
		
		for(int i = 0; i < mapping.length(); i++) {
			printComb(str, idx + 1, combination + mapping.charAt(i));
		}
		
	}
	
	
	public static void main(String[] args) {
		String str = "468";
		printComb(str, 0, "");
	}

}
