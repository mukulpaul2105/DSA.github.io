package Geekster.Searching.O3.ExponentialInfiniteArray;

public class ExponentialBinarySearch {
	
	public static int expoBinarySearch(int[] arr, int target) {
		
		int start = 0, end = 1, mid;
		// Setting the end
		while(target > arr[end]) {
			start = end;
			end = 2 * end;
			// Edge case : ArrayOutOfBound Exception
			if(end >= arr.length - 1) {
				end = arr.length - 1;
				break;
			}
			
		}
		
		// Regular Binary Search
		while(start <= end) {
			mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return - 1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 8, 9, 11, 24, 58, 59, 62, 65, 68, 80, 88, 90, 92};
		int target = 92;
		System.out.println(expoBinarySearch(arr, target));
	}

}
