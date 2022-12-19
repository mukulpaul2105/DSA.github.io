package Basics;

public class Kth_Bit_Set_or_not {

	public static void main(String[] args) {
		
		int k = 5;
		int n = 17;
		
		int mask = 1 << 5 - 1;
		
		if((n & mask) > 1) {
			System.out.println("Bit is set: 1");
		} else {
			System.out.println("Bit is not set: 0");
		}
		
	}
}
