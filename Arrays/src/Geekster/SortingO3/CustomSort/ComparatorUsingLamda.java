package Geekster.SortingO3.CustomSort;

import java.util.Arrays;

public class ComparatorUsingLamda {
	
	public static void main(String[] args) {
		Integer arr[] = {10, -1, 9, 1, 2, 5, 15, 3};
		
		Arrays.sort(arr, (x, y) -> {
			return y - x;
		});
		
		for(Integer i : arr) {
			System.out.print(i + ", ");
		}
	}

}
