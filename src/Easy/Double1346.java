package Easy;

import java.util.Arrays;

public class Double1346 {
	
	// This is Binary Search
	 public static int bs(int arr[], int start, int end, int target) {
	        while(start <= end) {
	        	int mid = start + (end - start) / 2;
				if(arr[mid] == target) {
					return mid;
				} else if(arr[mid] < target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
			return -1;
	    }
	    
	    public static boolean checkIfExist(int[] arr) {
	        Arrays.sort(arr);
//	        IntStream s = Arrays.stream(arr);
//	        s.forEach(i -> System.out.println(i));
	        for(int i = 0; i < arr.length; i++) {
	        	System.out.print(arr[i] + ", ");
	        }
	        System.out.println();
	        int idx, target; 
	        /*
	         * Exceptions / Problems
	         * 1. if element is 0 then multiple of 2 will also be 0 so it is handling by if(arr[i] == 0)
	         * 2. If elements are negative then the bigger number will be smaller than current / previous one
	         * so handling by else if(arr[i] < 0 && arr[i] % 2 == 0)
	         */
	        for(int i = 0; i < arr.length; i++) {
		        if(arr[i] < 0 && arr[i] % 2 == 0) {
	                target = arr[i] / 2;
	                idx = Arrays.binarySearch(arr, i + 1, arr.length, target);
	                
	            } else {
	                target = arr[i] * 2;
	                idx = Arrays.binarySearch(arr, i + 1, arr.length, target);
	            }
	            
	            if(idx > -1) {
	                return true;
	            }
		    }
		    return false;
	    }
	    
	    
	    
	    public static void main(String[] args) {
			int[] arr = {102,-592,457,802,98,-132,883,356,-857,461,-453,522,250,476,991,540,-852,-485,-637,999,-803,-691,-880,881,-584,750,-124,745,-909,-892,304,-814,868,665,50,-40,26,-242,-797,-360,-918,-741,88,-933,-93,360,-738,833,-191,563,449,840,806,-87,-950,508,74,-448,-815,-488,639,-334};
			
			System.out.println(checkIfExist(arr));
		}
}
