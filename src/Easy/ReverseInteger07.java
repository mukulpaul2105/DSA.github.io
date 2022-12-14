package Easy;

/*
 *  1. Using Extra space (Using Long Data Type
 */
class ReverseInteger07 {
	/*
	 * Check for overflows if overflow happens then print Overflow;
	 * A negative number must be negative
	 */

	public static int reverse(int x) {

		boolean isNegative = false;
		long res = 0;

		if(x < 0) {
			isNegative = true;
			x = (int)(-1 * x);
		}

		while(x > 0) {
			int RMD = (int) (x % 10);
			res = res * 10 + RMD;
			x = x / 10;

		}


		/*
		 * Checking The overflow
		 */
		if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
			System.out.println("OVERFLOW");
			return 0;
		} else if(isNegative == true) {
			return (int)(-1 * res);
		} else {
			return (int)(res);
		}
	}


	public static void main(String[] args) {
		int n = 1534236461;
		System.out.println(reverse(n));
		System.out.println(Integer.MAX_VALUE);
	}
}



/*
 * 2. Without Using extra DataType(without using Long dataType)
 * 		
 * 		Technique name is Running Overflow check
 */
class CheckRunnigOverflow {
	/*
	 * Check for overflows if overflow happens then print Overflow;
	 * A negative number must be negative
	 */

	public static int reverse(int x) {

		boolean isNegative = false;
		int res = 0;

		if(x < 0) {
			isNegative = true;
			x = (-1 * x);
		}
		/*
		 * Will not store variable into permanent variable
		 * we will store it into temp and check for overflow
		 */
		int temp = 0;
		while(x > 0) {
			int RMD = x % 10;
			temp = res * 10 + RMD;
			/*
			 *  Eg 56 * 10 + 7 = 576
			 *  	so 576 / 10 == 57
			 *  but if overflow happens then
			 *  786 * 10 + 8 = 1287(suppose)
			 *  786 / 10 != 128
			 *  
			 */
			if(temp / 10 != res) {
				System.out.println("OVERFLOW");
				return 0;
			}
			res = temp;
			x = x / 10;


		}


		/*
		 * Checking The overflow
		 */
		if(isNegative == true) {
			return (int)(-1 * res);
		} else {
			return (int)(res);
		}
	}


	public static void main(String[] args) {
		int n = 1534236469;
		System.out.println(reverse(n));
	}


}
