package Geekster.HashMap.Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*
 * Write a program to create a hashMap that take value of key from 0 to n
 * and assigns value same as key
 */
public class Practice1 {
	
	public static void print1toN(int n) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i = 1; i <= n; i++) {
			hm.put(i, i * i);
		}
		
//		for(var entry : hm.entrySet() ) {
//			System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
//		} 
		// OR
//		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//			System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
//		}
		
		// OR
		
//		for(int i = 0; i < n; i++) {
//			System.out.println(hm.get(i));
//		}
		
		// OR
		
//		Iterator<Map<Integer, Integer>> i = hm.entrySet();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = Integer.parseInt(sc.nextLine());
		print1toN(n);
	}

}
