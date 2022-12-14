package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterSectionOfTwoArrays349 {
	
	 public static int[] intersection(int[] nums1, int[] nums2) {
		 
		 List<Integer> result = new ArrayList<Integer>();
		 
		 
		 if(nums1.length < nums2.length) {
			 Arrays.sort(nums1);
			 for(int i = 0; i < nums2.length; i++) {
				 int target = nums2[i];
				 int idx = Arrays.binarySearch(nums1, target);
				 if(idx > -1) {
					 result.add(target);
				 }
			 }
		 } else {
			 Arrays.sort(nums2);
			 for(int i = 0; i < nums1.length; i++) {
				 int target = nums1[i];
				 int idx = Arrays.binarySearch(nums2, target);
				 if(idx > -1) {
					 result.add(target);
				 }
			 }
		 }
		 Collections.sort(result);
		 List<Integer> r = new ArrayList<Integer>();
		 for(int i = 0; i < result.size(); i++) {
			 if(!r.contains(result.get(i))) {
				 r.add(result.get(i));
			 }
		 }
		 int res[] = new int[r.size()];
		 for(int i = 0; i < r.size(); i++) {
			 res[i] = r.get(i);
		 }
		 
		 
		 return res;
	 }
	 
	 
	 public static void main(String[] args) {
		int[] arr = {1, 2, 2, 1};
		int[] arr2 = {2, 2};
		int[] result = intersection(arr, arr2);
		for(int i = 0; i < result.length; i++) {
			System.out.println("Result: " + result[i]);
		}
	}
}
