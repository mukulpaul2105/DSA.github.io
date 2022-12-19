package July.KS.Class.Challenges;

import java.util.Scanner;

public class Patterns {
	
	public static void pattern5(int n) {
		for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
	}
	
	
	public static void pattern_7_Pyramid(int n) {
		
		for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
	}
	
	
	public static void pattern_7_print_a_hollow_m_by_n_star_rectangle(int b, int l) {
		for(int i = 1; i <= l; i++) {
			for(int j = 1; j <= b; j++) {
				if(i == 1 || i == l || j == 1 || j == b) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void pattern_8_Print_a_hollow_square_without_top(int n) {
		Scanner sc = new Scanner(System.in);
//		int n = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == 1 || i == n || j == 1 || j == n || i == (n / 2) + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern_9_Square_Ladder_with_top_and_bottom(int n) {
		Scanner sc = new Scanner(System.in);
//		int n = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == 1 || i == n || j == 1 || j == n || i == (n / 2) + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	
	public static void pattern_12_Diamond(int n) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 2; i <= n ; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			
			for(int j = i; j <= n * 2 - i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
//		pattern_7_Pyramid(5);
//		pattern_7_print_a_hollow_m_by_n_star_rectangle(6, 4);
//		pattern_8_Print_a_hollow_square_without_top(6);
//		pattern_8_Print_a_hollow_square_without_top(6);
//		pattern_9_Square_Ladder_with_top_and_bottom(7);
		pattern_12_Diamond(5);
		
		System.out.println(("Pattern 9 - Square Ladder with top and bottom").replace(" ", "_"));
	}
}
