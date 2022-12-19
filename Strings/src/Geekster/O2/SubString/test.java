package Geekster.O2.SubString;

import java.util.Scanner;

public class test {

    private static int[] numToDigitArr(int n) {
        int size = 0;
        int m = n;
        while(m > 0){
            size++;
            m /= 10;
        }
        
        int[] nums = new int[size];
        for(int i = size - 1; i >= 0; i--) {
            nums[i] = n % 10;
            System.out.println(nums[i]);
            n /= 10;
        }
        return nums;
    }

    private static int maxFreq(int[] arr) {
        int[] freqArr = new int[10];
        
        int res = 0;
        for(int i = 0; i < freqArr.length; i++) {
            if(freqArr[i] > freqArr[res]) {
                res = i;
            }
        }
        return res;
    }

    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//        
//        int[] nums = numToDigitArr(n);
//        int res = maxFreq(nums);
//        System.out.println(res);
    	
    	System.out.println(04);
    }
}
