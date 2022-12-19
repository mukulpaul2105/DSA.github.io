package Geekster.Math.Inbuilt_methods;

public class O1_GCD {
	
	private static int gcd(int divisor, int dividend) {
		// Edge cases
		if(divisor == 0) {
			return dividend;
		}
		if(dividend == 0) {
			return divisor;
		}
		
		// Repeated division
		while(divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		
		return dividend;
	}

	public static void main(String[] args) {
		System.out.println(gcd(45, 9));
	}
}
