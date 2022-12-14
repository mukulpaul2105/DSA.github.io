package Geekster.SortingO1.BubbleSort;

/*
 * TC: O(N) {if the array is already sorted} to O(N^2) {if the array is sorted in reverse order}
 * SC: O(1)
 */

public class OptamizedBubbleSort {
	/*
	 * If the array got sorted by the first few iterations than there is no meaning for
	 * to run upto the total length of the array. 
	 * So we have to find solution for this.
	 * for that we will just add a flag
	 * 
	 */
	
	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		// 1st optimization
		boolean swapped = false;
		int temp;
		for(int i = 0; i < n - 1; i++) {
			// if there is no swap happened in the inner loop that means array got sorted
			// so come out of outer loop.
			// 2nd Optamization
			// Because in every iteration the larger numbers get placed in last
			for(int j = 0; j < n - 1 - i; j++) {
				if(arr[j + 1] < arr[j]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
		return arr;
	}
	
	public static void print(int[] arr) {
		for(int i : arr) {
			System.out.print(i + ", ");
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		print(bubbleSort(arr));
	}

}
