/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class CompareTriplets {
	static int[] solve(int a0, int a1,int a2, int b0, int b1, int b2) {
		
		int[] results = new int[2];
		
		int result1 = (a0 > b0 ? 1 : 0) + (a1 > b1 ? 1 : 0) + (a2 > b2 ? 1 : 0);
		int result2 = (a0 < b0 ? 1 : 0) + (a1 < b1 ? 1 : 0) + (a2 < b2 ? 1 : 0);
		
		results[0] = result1;
		results[1] = result2;
		
		return results;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		
		int result[] = solve(a0, a1, a2, b0, b1, b2);
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
