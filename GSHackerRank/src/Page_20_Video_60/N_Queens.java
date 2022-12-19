package Page_20_Video_60;

import java.util.Scanner;

public class N_Queens {

    private static boolean checkRowCol(int[][] arr, int row, int col, int n) {
        for(int i = 0; i < n; i++) {
            if(i != col && arr[row][i] == 1) {
                return false;
            }
        }
        for(int i = 0; i < n; i++) {
            if(i != row && arr[i][col] == 1) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean checkDiagonal(int[][] arr, int row, int col, int n) {
        // Diagonal 1 first half
        /*
        ^
          \
            \
        
        */
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(arr[i][j] == 1) return false;
        }
        
        // Diagonal 1 second half
        /*
                \
                 \
                  >
        */
        for(int i = row + 1, j = col + 1; i < n && j < n; i++, j++) {
            if(arr[i][j] == 1) return false;
        }
        
        /* Diagonal 2 first half
                ^
               /
              /
        */
        for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if(arr[i][j] == 1) return false;
        }
        
        /* Diagonal 2 second half
                     /
                    /
                   <
        */
        for(int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if(arr[i][j] == 1) return false;
        }
        
        return true;
    }
    
    
    private static String nQueens(int[][] arr, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 1) {
                    boolean check = checkRowCol(arr, i, j, n) && checkDiagonal(arr, i, j, n);
                    if(!check) {
                        return "Danger";
                    }
                }
            }
        }
        return "N Queens";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        String res = nQueens(arr, n);
        System.out.println(res);
    }
}
