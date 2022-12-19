package Geekster.O2.Problems;

import java.util.Stack;

public class ReverseString {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "arun singh";
		Stack<Character> stk = new Stack<>();
		for(var ch : str.toCharArray()) {
			stk.push(ch);
		}
		
		while(!stk.empty()) {
			System.out.print(stk.peek());
			stk.pop();
		}
	}

}
