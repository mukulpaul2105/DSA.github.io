 package Geekster.SortingO4.MergerSort;

import java.util.Arrays;

public class MergeSort {
	
	private static void conquer(int arr[], int si, int mid, int ei) {
		int merged[] = new int[ei - si + 1];
		
		// This will track first sorted array
		int idx1 = si;
		// This will track 2nd sorted array
		int idx2 = mid + 1;
		
		// this will track current array
		int x = 0;
		
		while(idx1 <= mid && idx2 <= ei) {
			if(arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}
		
		while(idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		
		while(idx2 <= ei) {
			merged[x++] = arr[idx2++];
		}
		
		for(int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}
	}
	
	/*
	 *  this method will perform only divide work
	 *   si = Starting Index and ei = ending Index
	 */
	public static void divide(int arr[], int si, int ei) {
		
		if(si >= ei) {
			return;
		}
		
		int mid = si + (ei - si) / 2;
		divide(arr, si, mid);
		divide(arr, mid + 1, ei);
		
		conquer(arr, si, mid, ei);
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {6, 3, 9, 5, 2, 8};
		int n = arr.length;
		
		divide(arr, 0, n - 1);
		
		Arrays.stream(arr).forEach((e) -> System.out.print(e + " "));
		
	}

}
