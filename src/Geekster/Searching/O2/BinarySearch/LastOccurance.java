package Geekster.Searching.O2.BinarySearch;

public class LastOccurance {
	
	public static int firstOsc(int arr[], int target) {
		int start = 0, end = arr.length;
		int result = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				result = mid;
				start = mid + 1;
			} else if(arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7};
		int target = 3;
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.binarySearch(arr, target));
		
		System.out.println(firstOsc(arr, target));
	}

}
