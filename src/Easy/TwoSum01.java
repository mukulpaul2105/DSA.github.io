package Easy;

import java.util.Arrays;

public class TwoSum01 {

	// 1. Sorting and binary search TC: O(nlogn)
	public static int[] checkTwoSum(int[] arr, int target) {
		int result[] = new int[2];
		 System.out.println(result[0] + ", " + result[1]);
		if(arr.length <= 2) {
			return result;
		}
		Arrays.sort(arr);

		int secondNum, idx;
		for(int i = 0; i < arr.length; i++) {
			 secondNum = target - arr[i];
			 idx = Arrays.binarySearch(arr, i + 1, arr.length, secondNum);
			 if(idx > -1) {
				 System.out.println(i + ", " + idx);
				 result[0] = i;
				 result[1] = idx;
				 System.out.println(result[0] + ", " + result[1]);
				 return result;
			 }
		}
		return result;
	}
	
	
	//2. Two pointer approach
	public static void tSum(int[] arr, int target) {
		Arrays.sort(arr);
		int low = 0, high = arr.length - 1;
		
		while(low <= high) {
			if(arr[low] + arr[high] == target) {
				System.out.println(low + ", " + high);
				low++;
				high--;
			} else if(arr[low] + arr[high] > target) {
				high--;
			} else {
				low++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {0,4,3,0};
		int target = 0;
		System.out.println(checkTwoSum(arr, target));
	}
	
}
