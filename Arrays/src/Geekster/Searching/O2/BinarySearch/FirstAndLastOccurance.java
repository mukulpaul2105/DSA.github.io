package Geekster.Searching.O2.BinarySearch;

/*
 *  if Flag is true then it will find the First Occurance
 *  if Flag is false then it will find the Last Occurance
 */
public class FirstAndLastOccurance {
	public static int occurance(int arr[], int target, boolean flag) {
		int start = 0, end = arr.length, result = -1;
		
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
		int target = 2;
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.binarySearch(arr, target));
		
		System.out.println(occurance(arr, target, false));
	}

}
