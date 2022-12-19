package Geekster.HashMap.O1.CountFrequncy;

import java.util.HashMap;

public class CountFrequncy {
	
	public static void countFrequency(String[] str) {
		/*
		 * Create a HashMap
		 */
		HashMap<String, Integer> hm = new HashMap<>();
		
		// Inserting String from array to hashMap, 
		// Taking String as Key and the frequency as values
		for(var word : str) {
			hm.put(word, ( hm.getOrDefault(word, 0) + 1 ) );
			/*
			 * getOrDefault : if there is value then fetch it if not than set it as 0
			 */
		}
		System.out.println(hm.size());
		
		for(var entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// Count the frequency of each word in this list
		String arr[] = {"arun", "singh", "roshan", "arun", "yadav", "nav", "singh"};
		countFrequency(arr);
		
		 
	}

}
