package Youtube.apnaCollege.Recursion.Advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation_Leetcode_46 {

	public static String swap1(String s, int l, int r) {
		char[] ch = s.toCharArray();
		char temp = ch[l];
		ch[l] = ch[r];
		ch[r] = temp;
		return String.valueOf(ch);
		
	}
	
	private static void printPermutation(String s, int left, int right) {
		if(left == right) {
			System.out.println(s);
			return;
		}
		for(int i = left; i <= right; i++) {
			String str = swap1(s, left, i);
			printPermutation(str, left + 1, right);
		}
	}
	
	public static void main(String[] args) {
		String s = "abcd";
//		printPermutation(s, 0, s.length() - 1);
		int[] arr = {1, 2, 3};
		List<List<Integer>> res = permute(arr);
		System.out.println(res);
		
	}
	
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // checking if array has only one element return that only
        if(nums.length == 1) {
        	res.add(Arrays.asList(nums[0]));
        	return res;
        }
        // else call the recursion method
        helper(nums, 0, nums.length - 1, res);
        // after recursion call all the permutations will be stored in the list now return it;
        return res;
    }

    private static void helper(int[] arr, int left, int right, List<List<Integer>> res) {
        if(left == right) {
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
            res.add(list);
            return;
        }

        for(int i = left; i <= right; i++) {
            swap(arr, left, i);
            helper(arr, left + 1, right, res);
            swap(arr, left, i);
        }
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
	
}
































