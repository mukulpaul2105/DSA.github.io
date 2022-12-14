package Easy;
/*
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfASortedArray977 {

	public static int[] sortedSquares(int[] nums) {
		
		int low = 0, high = nums.length - 1;
		int[] result = new int[nums.length];
		int k = result.length - 1;
		
		while(low <= high) {
			if(Math.abs(nums[low]) < Math.abs(nums[high])) {
				result[k] = nums[high] * nums[high];
				high--;
			} else {
				result[k] = nums[low] * nums[low];
				low++;
			}
			k--;
		}
		
		return result;
        
    }
	
	
	public static void print(int[] arr) {
		for(var i : arr) {
			System.out.print(i + ", ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {-4, -2, -1, 0, 5, 9, 10};
		print(sortedSquares(arr));
	}
}
