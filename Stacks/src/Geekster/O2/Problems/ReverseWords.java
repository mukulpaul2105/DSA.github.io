package Geekster.O2.Problems;

import java.util.Stack;

public class ReverseWords {
	
	public static void reverseWords(String str) {
		Stack<String> stk = new Stack<>();
		
		for(var s : str.split(" ")) {
			System.out.print(" " + s);
		}
		System.out.println();
		
		for(var word : str.split(" ")) {
			stk.push(word);
		}
		System.out.print(stk.pop());
		while(!stk.empty()) {
			System.out.print("." + stk.pop());
//			stk.pop();
		}
		
		
	}
	
	public static void main(String[] args) {
		String str = "Arun Mukul Rahul Ranjit Bablu Ranjan Sanu";
		String s = str.replace(" ", ".");
		System.out.println(s);
		reverseWords(s.replace(".", " "));
	}

}
