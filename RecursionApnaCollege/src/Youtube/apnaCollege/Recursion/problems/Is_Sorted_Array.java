package Youtube.apnaCollege.Recursion.problems;

public class Is_Sorted_Array {
	
	private static boolean isSortedArray(int[] arr, int idx) {
		if(idx == arr.length - 1) {
			return true;
		}
		
//		if(arr[idx] < arr[idx + 1]) {
//			return isSortedArray(arr, ++idx);
//		} else {
//			return false;
//		}
		
		// or
		if(arr[idx] >= arr[idx + 1]) {
			return false;
		}
		return isSortedArray(arr, ++idx);
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 6, 7, 10};
		boolean res = isSortedArray(arr, 0);
		System.out.println(res);
	}
	

}
