/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class MigratoryBirds {
	
	static int migratoryBirds(int[] arr) {
		
		int[] count = new int[6];
		int maxIndex = 1;
		
		for(int val : arr) {
			count[val]++;
		}
		
		for(int i = 0; i < count.length; i++) {

			if(count[i] > count[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		in.close();
		
		System.out.print(migratoryBirds(arr));
	}
}
