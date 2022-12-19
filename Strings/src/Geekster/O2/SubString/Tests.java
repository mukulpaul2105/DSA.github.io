package Geekster.O2.SubString;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class A {
	int i = 1;
	public A() {
		System.out.print(i + "" + getI());
	}
	
	public int getI() {
		return i;
	}
}


class B extends A {
	int i = 2;
	
	public int getI() {
		return i;
	}
	
}

public class Tests {
	
	public static void main(String[] args) {
		
		A a = new B();
//		System.out.println(a.getI());
//		LinkedList<Integer> ll = new LinkedList<>();
//		System.out.println(ll);
		
		List al = new ArrayList<>();
		al.add(true);
		al.add("string");
		al.add(39);
		System.out.println(al);
		
	}

}
