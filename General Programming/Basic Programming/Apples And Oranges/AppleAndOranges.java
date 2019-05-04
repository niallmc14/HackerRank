/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class AppleAndOranges {
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		
		int appInRange = 0;
		int oranInRange = 0;
		
		for(int i = 0; i < apples.length; i++) {
			
			apples[i] += a;
			if(apples[i] >= s && apples[i] <= t) {
				appInRange++;
			}
		}
		
		for(int j = 0; j < oranges.length; j++) {
			oranges[j] += b;
			
			if(oranges[j] >= s && oranges[j] <= t) {
				oranInRange++;
			}
		}
		
		System.out.print(appInRange + "\n" + oranInRange);
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int s = in.nextInt();
		
		int t = in.nextInt();
		
		int a = in.nextInt();
		
		int b = in.nextInt();
		
		int m = in.nextInt();
		
		int n = in.nextInt();
		
		int[] apples = new int[m];
		
		for(int i = 0; i < m; i++) {
			apples[i] = in.nextInt();
		}
		
		int[] oranges = new int[n];
		
		for(int j = 0; j < n; j++) {
			oranges[j] = in.nextInt();
		}
		in.close();
		countApplesAndOranges(s, t, a, b, apples, oranges);
	}

}
