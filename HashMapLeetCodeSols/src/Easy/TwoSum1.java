package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum1 {

	public static int[] twoSum(int[] arr, int target) {
        int result[] = new int[2];
        if(arr.length == 0 || arr == null) {
            return result;
        }
        
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
    	ArrayList<Integer> list = new ArrayList<>();
    	list.add(-1);
    	list.add(0);
        
        for(int i = 0; i < arr.length; i++) {
//        	hm.put(arr[i], ));
        }
        
        
        return result;
    }
	
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] res = twoSum(nums, target);
		for(var r : res) {
			System.out.println(r);
		}
		
	}
}
