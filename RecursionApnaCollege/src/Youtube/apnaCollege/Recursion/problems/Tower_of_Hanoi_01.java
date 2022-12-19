package Youtube.apnaCollege.Recursion.problems;

public class Tower_of_Hanoi_01 {

	private static void towerOfHanoi(int n, String src, String helper, String dest) {
		if(n == 1) {
			System.out.println("Transfer disc: " + n + " from " + src + " to " + dest);
			return;
		}
		
		towerOfHanoi(n - 1, src, dest, helper);
		System.out.println("Transfer disc: " + n + " from " + src + " to " + dest);
		towerOfHanoi(n - 1, helper, src, dest);
	}
	
	
	
	public static void main(String[] args) {
		towerOfHanoi(3, "S","H", "D");
	}
	
}