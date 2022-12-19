package Geekster.Searching.O1.LinearSearch;

public class LinearSearch {
	
	public static int linearSearch(int arr[], int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				System.out.println("found target " + i);
				return i;
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 8, 9, 11, 24, 58, 59, 62, 65, 58, 80, 88, 90};
		int target = 62;
		System.out.println(linearSearch(arr, target));
	}

}
