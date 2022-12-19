package Geekster.Math.Inbuilt_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Primes_upto_n {
	
	private static String revString(String str, int n) {
        Stack<Character> stk = new Stack<>();
        
        for(char c : str.toCharArray()) {
            if(('a' <= c && c >='z') || ('A' <= c && c >= 'Z')) {
                stk.push(c);
            }
        }
        
//        while(!stk.isEmpty()) {
//        	System.out.println(stk.peek());
//        	stk.pop();
//        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if(('a' <= c && c >='z') || ('A' <= c && c >= 'Z')) {
                sb.append(stk.peek());
                stk.pop();
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		String s = "a-bC-dEf-ghIj";
//		System.out.println(revString(s, s.length()));
//		System.out.println((int)'Z');
		
		
		System.out.println(0x1CA);
		System.out.println(0b1100);
		System.out.println(010);
	}
	
}
