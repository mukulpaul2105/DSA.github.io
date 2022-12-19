package Geekster.HashMap.Practice;

import java.util.HashMap;
import java.util.List;

public class FrequencyCountWithAVariable {

	private static List<Integer> printNums(int[] arr, int k) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(var num : arr) {
			hm.put(num, hm.getOrDefault(num, 0) + 1);
		}
		
		for(var entry : hm.entrySet() ) {
			if(entry.getValue() == k) {
				System.out.println("Number: " + entry.getKey() + ": Occurred: " + entry.getValue() + " times");
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {3, 1, 4, 4, 5, 2, 6, 1, 1, 6, 5, 5, 6, 6, 1, 6};
		int k = 5; // It is the frequency. Means whichever number is occurring k time print that nums
		System.out.println(printNums(arr, k));
	}

}
