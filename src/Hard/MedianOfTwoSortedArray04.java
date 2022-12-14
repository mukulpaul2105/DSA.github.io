package Hard;

public class MedianOfTwoSortedArray04 {


	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = 0, j = 0, k = 0;
		int m = nums1.length, n = nums2.length;
		int[] res = new int[m + n];

		while(i < m && j < n) {
			if(nums1[i] < nums2[j]) {
				res[k] = nums1[i];
				k++;
				i++;
			} else {
				res[k] = nums2[j];
				k++;
				j++;
			}
		}

		while(i < m) {
			res[k] = nums1[i];
			k++;
			i++;
		}

		while(j < n) {
			res[k] = nums2[j];
			k++;
			j++;
		}
		
		for(var q : res) {
			System.out.print(q + " ");
		}

		System.out.println("-------------------------");
		
		int mid;
		double result;
		if(res.length % 2 != 0) {
		      mid = (res.length / 2);
		      return res[mid];
		   } else {
		      mid = (res.length / 2) - 1;
		      result = (res[mid] + res[mid + 1]);
		      return result / 2;
		  }

	}


	public static void print(int[] arr) {
		for(var i : arr) {
			System.out.print(i + ", ");
		}
	}

	public static void main(String[] args) {

		int[] arr1 = {1, 2, 6, 7, 8, 9, 10, 15};
		int[] arr2 = {3, 4, 5, 11, 16, 17, 20};
	
		System.out.println(findMedianSortedArrays(arr1, arr2));
	}

}
