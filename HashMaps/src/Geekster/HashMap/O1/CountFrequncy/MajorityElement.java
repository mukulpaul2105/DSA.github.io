package Geekster.HashMap.O1.CountFrequncy;

import java.util.HashMap;

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {

		int res = -1;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(var i : nums) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}
		
		for(var entry : hm.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		int value = 0;
		for(var entry : hm.entrySet()) {
			if(entry.getValue() > value) {
				value = entry.getValue();
				res = entry.getKey();
			}
		}
		
		System.out.println("Majority Element: " + res);
		
		return res;
	}
	
	
	// Only 2 numbers are there in the array and have to find the majority one
	public static int majorElem(int[] nums) {
		int majorityElem = -1;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(var i : nums) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}
		
		for(var entry : hm.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		int N = nums.length;
		for(var entry : hm.entrySet()) {
			if(entry.getValue() > N / 2) {
				majorityElem = entry.getKey();
			}
		}
		
		System.out.println("Majority Element: " + majorityElem);
		
		return majorityElem;
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = {2, 2, 2, 1, 1, 3, 1, 3, 4, 4, 3, 1, 2, 2 };
//		majorityElement(nums);
		
		
		int[] nums2 = {2, 2, 2, 1, 1, 1, 1, 2, 2};
		majorElem(nums2);
	}

}
