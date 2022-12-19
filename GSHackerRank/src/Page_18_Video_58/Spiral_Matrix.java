package Page_18_Video_58;

public class Spiral_Matrix {

	private static int[] spiralMatrix(int[][] arr, int rows, int cols) {
        int[] res = new int[rows * cols];
        int startRow = 0, endRow = rows - 1;
        int startCol = 0, endCol = cols - 1;
        int idx = 0;
        
        while(startRow <= endRow && startCol <= endCol) {
            // This is for first col to last col of starting row
            for(int i = startCol; i <= endCol; i++) {
                res[idx] = arr[startRow][i];
                idx++;
                
                // System.out.print(arr[startRow][i] + "   ");
            }
            startRow++; // After printing the row it is no longer needed so incresing it
            
            // This is for printing from first row to last row of last col
            for(int i = startRow; i <= endRow; i++) {
                res[idx] = arr[i][endCol];
                idx++;
                
                // System.out.print(arr[i][endCol] + "   ");
            }
            endCol--;
            
            // this is for printing last col to first col of last row
            
            // In this loop we have to check otherwise it will run for extra 1 time which gives error
            for(int i = endCol; i >= startCol && idx < res.length; i--) {
                res[idx] = arr[endRow][i];
                idx++;
                
                // System.out.print(arr[endRow][i] + "   ");
            }
            endRow--;
            
            // This is for printing last row to first row of first Col
            for(int i = endRow; i >= startRow; i--) {
                res[idx] = arr[i][startCol];
                idx++;
                
                // System.out.print(arr[i][startCol] + "   ");
            }
            startCol++;
        }
        return res;
    }
	

	// Shift Matrix from this onward
    private static void reverse(int[][] arr, int idx, int s, int e) {
        int temp;
        while(s < e) {
        	temp = arr[idx][s];
        	arr[idx][s] = arr[idx][e];
        	arr[idx][e] = temp;
        	s++; e--;
        }
    }
    
    
    private static void shiftMatrix(int[][] arr, int n, int rotateBy) {
        for(int i = 0; i < n; i++) {
            reverse(arr, i,  0, n - rotateBy - 1);
            reverse(arr, i,  n - rotateBy, n - 1);
            reverse(arr, i,  0, n - 1);
        }
    }

    public static void main(String[] args) {
    	
        int[][] arr = {{1, 2, 3, 4},
        			   {5, 6, 7, 8},
        			   {9, 10, 11, 12},
        			   {13, 14, 15, 16}};
        
//        int[] result = spiralMatrix(arr, 4, 4);
        shiftMatrix(arr, arr.length, 2);
//        for(int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + "   ");
//        }
        
        for(int i = 0; i < arr.length; i++) {
        	for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[i][j] + "   ");}
        	System.out.println();
        }
        
        
        
    }
	
}
