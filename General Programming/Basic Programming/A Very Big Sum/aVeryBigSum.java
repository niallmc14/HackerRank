/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class aVeryBigSum {
	
	static long aVeryBigSum(int n, long[] ar) {
        // Complete this function
        long sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += ar[i];
        }
        return sum;
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] ar = new long[n];
		
		for(int i = 0; i < n; i++) {
			ar[i] = in.nextLong();
		}
		in.close();
		long longResult = aVeryBigSum(n, ar);
		System.out.print(longResult);
	}

}
