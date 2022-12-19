package Stack.Concepts;

import java.util.Arrays;
import java.util.Stack;

public class Previous_Smallest {
	
	private static int[] previousSmallest(int[] arr, int n) {
		Stack<Integer> stk = new Stack<>();
		int[] prevSmall = new int[n]; 
		
		for(int i = 0; i < n; i++) {
			while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]) {
				stk.pop();
			}
			
			if(!stk.isEmpty()) {
				prevSmall[i] = stk.peek();
			} else {
				prevSmall[i] = -1;
			}
			stk.push(i);
		}
		return prevSmall;
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 2, 1, 5, 6, 3, 2, 4, 2};
		
		int[] previous_imediate_smallest_elem_inx = previousSmallest(arr, arr.length);
		Arrays.stream(previous_imediate_smallest_elem_inx).forEach(e -> System.out.print(e + " "));
	}

}
