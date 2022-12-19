package Geekster.HashMap.O1.CountFrequncy;

import java.util.HashMap;

public class UniqueOccurance {
	
	public static void uniqueOccurance(int[] nums) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(var i : nums) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}
		
		for(var entry : hm.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}

	
	public static void main(String[] args) {
		
		int[] nums = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
		
		uniqueOccurance(nums);
	}
}
