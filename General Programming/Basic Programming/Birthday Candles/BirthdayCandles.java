/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class BirthdayCandles {
    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        
        int freq = 0;
        int max = 0;
        
        for(int i = 0; i < ar.length; i++){
            if(max < ar[i]){
                max = ar[i];
            }
        }
        
        for(int i = 0; i < ar.length; i++){
            if(max == ar[i]){
                freq++;
            }
        }
       return freq;
    }

    public static void main(String[] args) {
    	
    	//Declaration of Variables
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
