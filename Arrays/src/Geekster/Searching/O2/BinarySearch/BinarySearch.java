package Geekster.Searching.O2.BinarySearch;


public class BinarySearch {

	public static int search(int arr[], int target) {
		int start = 0, end = arr.length;
		
		while(start <= end) {
//			int mid = (start + end) / 2; // Prone to overflow
			
			int mid = start + (end - start) / 2;
			
			if(arr[mid] == target) {
				return mid;
			} else if(arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		// -1 indicates that target is missing from the array
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 8, 9, 11, 24, 58, 59, 62, 65, 68, 80, 88, 90};
		int target = 59;
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.binarySearch(arr, target));
		
		System.out.println(search(arr, target));
		
		System.out.println(Integer.MAX_VALUE);
	}
	
}
