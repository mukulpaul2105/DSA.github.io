package Geekster.HashMap.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Next_Greater_Element_496 {

	public static int[] nextGreaterElement(int[] query, int[] nums) {
        int n = nums.length;
        // Next Greater element array
        int nge[] = nextGreaterRight(nums, n);
        System.out.println(Arrays.toString(nge));
        // HashMap to store elements as key and it's next greater element as value
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++) {
            hm.put(nums[i], nge[i]);
        }
//
//        // To store result
        int[] res = new int[query.length];
        for(int i = 0; i < query.length; i++) {
            res[i] = hm.get(query[i]);
        }
        return res;
    }

    private static int[] nextGreaterRight(int[] arr, int n) {
        int[] nge = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i = n -1; i >= 0; i--) {
            while(!stk.isEmpty() && stk.peek() < arr[i]) stk.pop();
            nge[i] = (stk.isEmpty()) ? -1 : stk.peek();
            stk.push(arr[i]);
        }
        return nge;
    }
    
    public static void main(String[] args) {
    	int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};
    	int[] res = nextGreaterElement(nums1, nums2);
    	System.out.println(Arrays.toString(res));
	}
	
}
