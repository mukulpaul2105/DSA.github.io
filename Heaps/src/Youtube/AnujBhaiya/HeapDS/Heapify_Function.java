package Youtube.AnujBhaiya.HeapDS;

import java.util.Arrays;

public class Heapify_Function {

	private static void heapify(int[] arr, int n, int currIdx) {
		// n = Length of the array and currIdx = from which index we want to make the heap
		
		int largest = currIdx;
		int left = 2 * currIdx;
		int right = 2 * currIdx + 1;
		
		// Checking the edge cases
		if(left <= n && arr[left] > arr[largest]) {
			largest = left;
		}
		
		if(right <= n && arr[right] > arr[largest]) {
			largest = right;
		}
		
		// swapping 
		if(largest != currIdx) {
			int temp = arr[currIdx];
			arr[currIdx] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, n, largest);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {20, 10, 30, 5, 50, 40};
		int n = arr.length;
		for(int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		
		Arrays.stream(arr).forEach((e) -> System.out.print(e + " "));
		
	}
	
}
