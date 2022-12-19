package Geekster.O2.Problems;

import java.util.Scanner;
import java.util.Stack;

public class Delete_Consecutive_Strings {


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        
        String[] str = {"aa", "ab", "ab", "ac"};
//        for(int i = 0; i < n; i++) {
//            str[i] = sc.next();
//        }
//        sc.close();
        
        deleteConsecutive(str, str.length);
    }
    
    private static void deleteConsecutive(String[] arr, int n) {
        Stack<String> stk = new Stack<>();
        for(int i = 0; i < n; i++) {
            if(!stk.isEmpty() && arr[i].equals(stk.peek())) {
                stk.pop();
            } else {
                stk.push(arr[i]);
            }
        }    
        
        System.out.println(stk.size());
    }
	
}
