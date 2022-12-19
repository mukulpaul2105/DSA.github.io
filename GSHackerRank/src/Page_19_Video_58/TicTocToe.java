package Page_19_Video_58;
/*
 * Check row , col and digonal for each traverse
 */
public class TicTocToe {
	
	public static void main(String[] args) {
		int[][] arr = {{1, 0, 1},
					   {0, 1, 0},
					   {0, 1, 1}};
		
		String res = tictacToe(arr, 3);
		System.out.println(res);
	}

	private static String tictacToe(int[][] arr, int n) {
		int leftDCount = 0, rightDCount = 0;
		for(int i = 0; i < n; i++) {
			int rowCount = 0, colCount = 0;
			for(int j = 0; j < n; j++) {
				// for row count
				if(arr[i][j] == 0) rowCount++;
				// for col count
				if(arr[j][i] == 0) colCount++;
				
				// for left to right diagonal
				if(i == j  && arr[i][j] == 0) leftDCount++;
				
				// for right to left diagonal
				if(i + j == n -1 && arr[i][j] == 0) rightDCount++;
			}
			
			// Checking if row have all 0's or 1's and same for col
			if(rowCount == 3 || rowCount == 0 || colCount == 3 || colCount == 0) {
				return "End Game";
			}
			
		}
		// Checking if row have all 0's or 1's and same for col
		if(leftDCount == 3 || leftDCount== 0 || rightDCount == 3 || rightDCount == 0) {
			return "End Game";
		}
		
		return "Draw";
	}

}
