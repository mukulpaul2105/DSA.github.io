package Youtube.AnujBhaiya.HeapDS.Problems;

import java.util.PriorityQueue;

public class Kth_Largest_Smallest_Element {
	/*
	 *  flag if true Kth largest element
	 *  flag if false Kth Smallest Element
	 */
	
	private static int kthLargestElement(int[] arr, int k, boolean flag) {
		
		if(k >= arr.length) {
			return -1;
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < k; i++) {
			if(flag == true) {
				pq.add(arr[i]);
			} else {
				pq.add((-1) * arr[i]);
			}
		}
		
		for(int i = k; i < arr.length; i++) {
			if(pq.peek() < arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		if(flag == true) {
			return pq.peek();
		} else {
			return pq.peek();
		}
	}

	public static void main(String[] args) {
		int arr[] = {20, 10, 60, 30, 50, 40};
		System.out.println(kthLargestElement(arr, 3, true));
	}
	
}
