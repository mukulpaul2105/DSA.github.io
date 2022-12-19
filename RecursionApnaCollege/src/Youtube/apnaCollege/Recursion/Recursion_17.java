package Youtube.apnaCollege.Recursion;

public class Recursion_17 {

	//Q1. Print Numbers from 5 to 1
	public static void printNum(int n) {
		System.out.println(n);
		if(n == 1) {
			return;
		}
		printNum(n - 1);
	}
	
	//Q2. Print Numbers from 1 to 5
		public static void printNum2(int n) {
			if(n == 6) {
				return;
			}
			System.out.println(n);
			printNum2(n + 1);
		}
		
		
	// Q3. Print Sum of first n natural numbers
		private static void printSum(int i, int n, int sum) {
			if(i == n) {
				sum += i;
				System.out.println(sum);
				return;
			}
			sum += i;
			printSum(i + 1, n, sum); 
			System.out.println(i);
		}
	
		
		// Q4. Print Factorial of a number n
		private static int calcFactorial(int n) {
			if(n == 1 || n == 0) {
				return 1;
			}
			int fact_nm1 = calcFactorial(n - 1);
			int fact_n = n * fact_nm1;
			return fact_n;
		}
		
		
		// Q5. Print Fibonacci sequence till nth term
		private static void fibonacci(int a, int b, int n) {
			if(n == 0) {
				return;
			}

			int c = a + b;
			System.out.println(c);
			fibonacci(b, c, n - 1);
		}
		
		
		// Q6. Print x ^ n (Stack height = n)
		private static int calcXPowN(int x, int n) {
			if(n == 0) {
				return 1;
			}
			if(x == 0) {
				return 0;
			}
			
			int xPownm1 = calcXPowN(x, n -1);
			int xPown = x * xPownm1;
			return xPown;
		}
		
		// Q7. Print x ^ n (Stack height = logn)
		private static int calcPowerN(int x, int n) {
			if(n == 0) {
				return 1;
			}
			if(x == 0) {
				return 0;
			}
			
			if(n % 2 == 0) {
				return calcPowerN(x, n / 2) * calcPowerN(x, n / 2);
			} else {
				return x * calcPowerN(x, n / 2) * calcPowerN(x, n / 2);
			}
		}
	
	
	public static void main(String[] args) {
//		printNum(5);
//		printNum2(1);
//		printSum(1, 5, 0);
		
//		System.out.println(calcFactorial(6));
		
//		int a = 0, b = 1;
//		System.out.println(a);
//		System.out.println(b);
//		int n = 7;
//		fibonacci(a, b, n - 2);
		
//		System.out.println(calcXPowN(2, 5));
		
		System.out.println(calcPowerN(2, 5));
		
		
	}
}
