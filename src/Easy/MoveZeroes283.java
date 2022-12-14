package Easy;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes283 {
	
	
	public static void moveZeroes(int[] nums) {
		
		int nonZeroElmPointer = 0, temp;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                temp = nums[i];
                nums[i] = nums[nonZeroElmPointer];
                nums[nonZeroElmPointer] = temp;
                nonZeroElmPointer++;
            }
        }
    }
	
	public static void printOP(int[] arr) {
		for(int i : arr) {
			System.out.print(i + ", ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 0, 0, 4, 5, 0};
		moveZeroes(nums);
		printOP(nums);
	}
}
