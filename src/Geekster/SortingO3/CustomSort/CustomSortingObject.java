package Geekster.SortingO3.CustomSort;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
	int salary;
	String name;
	
	Employee(int sal, String name) {
		this.salary = sal;
		this.name = name;
		
	}
}


public class CustomSortingObject {
	
	static class Comp implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Employee e1 = (Employee)o1;
			Employee e2 = (Employee)o2;
			return e2.salary - e1.salary;
		}
		
	}

	public static void main(String[] args) {
		
		Employee[] arr = {
				new Employee(2000, "singh"),
				new Employee(1000, "singh"),
				new Employee(3500, "arun"),
				new Employee(90000, "xyz"),
				new Employee(3000, "singh"),
				new Employee(4500, "ar"),
				new Employee(4000, "arun"),
				
		};

		/*
		 * 1. Arrange Employees based on decreasing order of salary.
		 */
//		Arrays.sort(arr, new Comp());
		
//		Arrays.sort(arr, (ob1, ob2) -> ob2.salary - ob1.salary);
		
//		for(var e : arr) {
//			System.out.println(e);
//		}
		

		/*
		 * 2. Arrange Employees based on decreasing order of name.
		 */
//		
//		Arrays.sort(arr, (ob1, ob2) -> ob2.name.length() - ob1.name.length());
//		
//		for(var e : arr) {
//			System.out.println(e);
//		}
//		

		/*
		 * 3. Arrange same name Employees in decreasing order of their salary, and
		 * 	  for the rest leave them as it is.
		 */
		
		Arrays.sort(arr, (ob1, ob2) -> {
			if(ob2.name.equals(ob1.name)) {
				return ob2.salary - ob1.salary;
			}
			return 0;
		});
		
		for(var e : arr) {
			System.out.println(e.name + ": " + e.salary);
		}
	}
}
