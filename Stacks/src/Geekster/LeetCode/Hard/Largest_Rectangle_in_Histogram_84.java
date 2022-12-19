package Geekster.LeetCode.Hard;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram_84 {

    private static int[] prevoiusSmaller(int[] arr, int n) {
        int[] ps = new int[n];
        Stack<Integer> stk = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]) {
                stk.pop();
            }
            
            if(!stk.isEmpty()) {
                ps[i] = stk.peek();
            } else {
                ps[i] = -1;
            }
            stk.push(i);
        }
        return ps;
    }
    
    
    private static int[] nextSmaller(int[] arr, int n) {
        int[] ns = new int[n];
        Stack<Integer> stk = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--) {
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]) {
                stk.pop();
            }
            
            if(!stk.isEmpty()) {
                ns[i] = stk.peek();
            } else {
                ns[i] = n;
            }
            
            stk.push(i);
        }
        return ns;
    }
    
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] ps = prevoiusSmaller(heights, n); //Arr for storing previoius small elem's idx
        int[] ns = nextSmaller(heights, n); // Array for stroing next small elem's index
        
        int maxArea = 0;
        for(int i = 0; i < n; i++) {
            int area = (ns[i] - ps[i] - 1) * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
        
    }
    
    
    public static void main(String[] args) {
		int[] arr = {4, 2, 1, 5, 6, 3, 2, 4, 2};
		int res = largestRectangleArea(arr);
		System.out.println(res);
//		
//		System.out.println("NextSmaller");
//		
//		Arrays.stream(nextSmaller(arr, arr.length)).forEach((e) -> System.out.print(e + " "));
//
//		System.out.println();
//		System.out.println("prevSmaller");
//		
//		Arrays.stream(prevoiusSmaller(arr, arr.length)).forEach((e) -> System.out.print(e + " "));
	}
}
