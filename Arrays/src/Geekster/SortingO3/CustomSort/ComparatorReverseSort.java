package Geekster.SortingO3.CustomSort;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorReverseSort {
	
	/*\
	 *  Old and outdated way
	 */
	static class Comp implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
		
	}
	
	public static Integer[] customSort(Integer[] arr) {
		Arrays.sort(arr, new Comp());
		 
		return arr;
	}
	
	
	
	public static void print(Integer[] arr) {
		/*
		 * For each
		 * This is only used for iterating / displaying
		 *  Here we don't need to worry about the length
		 *  when the last index reaches it get stop
		 *  
		 *  Here we don't have the access to the index so we cannot modify the array
		 */

		System.out.print("[ ");
		for(int a : arr) {
			System.out.print(a + ", ");
		}

		System.out.println("]");
	}
	
	public static void main(String[] args) {
		Integer arr[] = {10, -1, 9, 1, 2, 5, 15, 3};
		print(customSort(arr));
	}

}
