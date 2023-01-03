package Geekster.HashMap.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_K_Frequent_Element_347 {

	public int[] topKFrequent(int[] nums, int k) {
        /*Steps:
            1. create a hashmap use nums as key and value as it's count
            2, iterate hashmap and check the values are greater than or equeal to k store it into result array
        */
        int n = nums.length;
        if(n == 1 && k == 1) return nums;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int num: nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(var e: hm.entrySet()) {
            pq.add(e);
        }
        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = pq.poll().getKey();
        }
        return res;
    }
}
