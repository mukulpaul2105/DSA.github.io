package Easy;

import java.util.HashMap;
import java.util.Map.Entry;

/*
 * 1394. Find Lucky Integer in an Array
Easy

791

22

Add to List

Share
Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.

 

Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
 

Constraints:

1 <= arr.length <= 500
1 <= arr[i] <= 500
Accepted
80,229
Submissions
126,276
Seen this question in a real interview before?

Yes

No
 */
public class FindLuckyIntegerInAnArray1394 {

	public static int findLucky(int[] arr) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(var num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        int res = -1;
        for(Entry<Integer, Integer> entry : hm.entrySet())
        {
//            if(entry.getKey() == entry.getValue() && entry.getKey() > res) {
//            	res = entry.getKey();
//            }
        	
        	//			OR
        	
        	if(entry.getKey() == entry.getValue()) {
        		res = Math.max(entry.getKey(), res);
        	}
        }
        return res;
    }
	
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
		System.out.println(findLucky(arr));
	}
	
}






