package Geekster.Sorting.MergeTwoSortedArray;

public class MergeTwoSortedArray {
	
	public static int[] findMedianSortedArrays(int[] a1, int[] a2) {
		int i = 0, j = 0, k = 0;
		int m = a1.length, n = a2.length;
		int[] res = new int[m + n];
		
		while(i < m && j < n) {
			if(a1[i] < a2[j]) {
				res[k] = a1[i];
				k++;
				i++;
				
			} else {
				res[k] = a2[j];
				j++;
				k++;
			}
		}
		
		while(i < m) {
			res[k] = a1[i];
			i++;
			k++;
		}
		
		while(j < n) {
			res[k] = a2[j];
			k++;
			j++;
		}
		
		return res;
	}


	public static void print(int[] arr) {
		for(var i : arr) {
			System.out.print(i + ", ");
		}
	}

	public static void main(String[] args) {

		int[] arr1 = {1, 2, 5, 6, 8, 9, 10, 15, 20};
		int[] arr2 = {3, 4, 7, 10, 14, 18};
	
		print(findMedianSortedArrays(arr1, arr2));
	}


}
