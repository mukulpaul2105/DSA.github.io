package Geekster.SortingO1.BubbleSort;

/*
 * TC: O(n^2)
 * SC: O(1)
 */

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		int temp;
		// outerloop is only for run the loop n number of time
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - 1; j++) {
				if(arr[j + 1] < arr[j]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
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
