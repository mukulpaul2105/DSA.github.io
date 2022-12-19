package Youtube.AnujBhaiya.HeapDS;

import java.util.Arrays;

public class Heap_Sort {
	
	
	private static void heapify(int arr[], int n, int i) {
		int largest = i;
		int left = 2 * i;
		int right = 2 * i + 1;
		if(left <= n && arr[left] > arr[largest]) {
			largest = left;
		}
		
		if(right <= n && arr[right] > arr[largest]) {
			largest = right;
		}
		
		if(largest != i) {
			swap(arr, largest, i);
			
			heapify(arr, n, largest);
		}
	}
	
	private static void swap(int[] arr, int l, int h) {
		int temp = arr[l];
		arr[l] = arr[h];
		arr[h] = temp;
	}
	
	private static void heapSort(int arr[], int n) {
		
		for(int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n - 1, i);
		}
		
		for(int i = n - 1; i > 0; i--) {
			swap(arr, i, 0);
			heapify(arr, i - 1, 0);
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {40, 10, 30, 50, 18, 60, 15};
		int n = arr.length;
		
		heapSort(arr, n);
		
		Arrays.stream(arr).forEach((e) -> System.out.print(e + " "));
	
		System.out.println();
	}

}
