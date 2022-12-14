package Easy;

public class SingleNumber136 {

	public static int singleNum(int[] arr) {
		int res = arr[0];
		for(int i = 1; i < arr.length; i++) {
			res = res ^ arr[i];
			System.out.println(res);
		}
		return res;
	}
	/*
	 *  The idea hinges on 3 properties of xor. (1) that its a commutative operation 
	 *  (i.e. a xor b = b xor a). (2) that something xor itself is 0. So a xor a = 0. 
	 *  And (3) 0 xor a = a. These three properties mean that
	 *  a xor b xor a = a xor a xor b = 0 xor b = b.
	 */
	
	public static void main(String[] args) {
		int[] arr = {3,1,2,3,4,1,2};
		System.out.println("result: " + singleNum(arr));
	}
}
