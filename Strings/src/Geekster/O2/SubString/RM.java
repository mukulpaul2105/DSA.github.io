package Geekster.O2.SubString;

import java.util.ArrayList;
import java.util.List;

public class RM {

	public static List<Double> ra(List<Integer> a) {
		List<Double> res = new ArrayList<>();
        if(a.size() == 0) return null;
        if(a.size() == 1) {
        	Double double1= (double)a.get(0);
        	res.add(double1);
        	return res;
        }
        if(a.size() == 2) {
        	Double double1= (double)((a.get(0) + a.get(1)) / 2);
        	res.add(double1);
        	return res;
        }

        Double double1= (double)a.get(0);
    	res.add(double1);
    	
    	double1= (double)((a.get(0) + a.get(1)) / 2);
    	res.add(double1);
    	
    	int start = 2, end = a.size() - 1;
    	while(start <= end) {
    		if(start % 2 == 0) {
            	double1= (double)((a.get(start / 2) + a.get(start / 2 - 1)) / 2);
            	res.add(double1);
            	start++;
            } else {
            	double1= (double)(a.get(start / 2));
            	res.add(double1);
            	start++;
            }
    	}
        
        return res;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(7);
		System.out.println(list);
		
		System.out.println(ra(list));
	}

}
