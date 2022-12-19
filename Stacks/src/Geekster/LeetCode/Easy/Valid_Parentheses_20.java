package Geekster.LeetCode.Easy;

import java.util.Stack;

/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */
public class Valid_Parentheses_20 {

	public static boolean isValid(String s) {
        if(s.length() % 2 != 0) {
        	return false;
        }
		Stack<Character> stk = new Stack<>();
		for(var ch : s.toCharArray()) {
			if(!stk.isEmpty() && ((stk.peek() == '(' && ch == ')' )
					|| (stk.peek() == '{' && ch == '}' ) 
					|| (stk.peek() == '[' && ch == ']' ))) {
				stk.pop();
			} else {
				stk.push(ch);
			}
		}
		
		if(stk.empty()) {
			return true;
		}
		
		return false;
    }
	
	public static void main(String[] args) {
		String s = "(){}[((()))]";
		System.out.println(isValid(s));
		
	}
}
