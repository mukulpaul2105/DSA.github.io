package Geekster.Searching.O2.BinarySearch;

public class Frequency {
	
	public static int occurance(int arr[], int target, boolean flag) {
		int start = 0, end = arr.length - 1, result = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				if(flag == true) {
					result = mid;
					end = mid - 1;
				} else {
					result = mid;
					start = mid + 1;
				}
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
		int target = 6;
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.binarySearch(arr, target));
		
		int firstOccurance = occurance(arr, target, true);
		int lastOccurance = occurance(arr, target, false);
		int frequency = lastOccurance - firstOccurance + 1;
		System.out.println("Frequency: " + frequency);
	}
}
