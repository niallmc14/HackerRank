/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class DiagonalDifference {
	
	static int diagonalDifference(int[][] a) {
		
		int total0 = 0;
		int total1 = 1;
		int length = a.length;
		
		for(int i = 0; i < length; i++) {
			total0 += a[i][i];
		}
		
		for(int j = 0; j < length; j++) {
			total1 += a[j][length - 1 - j];
		}
		
		total0 -= total1;
		
		if(total0 < 0) {
			total0 *= -1;
		}
		return total0;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
	}
}
