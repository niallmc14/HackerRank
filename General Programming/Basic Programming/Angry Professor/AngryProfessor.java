/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class AngryProfessor {
	
	static String angryProfessor(int k, int[] arr) {
		
		int onTime = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 0) {
				onTime++;
			}
		}
		return onTime < k ? "YES" : "NO";
	}
	
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Test Case: ");

			int test = in.nextInt();
			
			for(int i = 0; i < test; i++) {
				System.out.print("Size of array: ");
				int n = in.nextInt();
				System.out.print("Threshold: ");
				int k = in.nextInt();
				int[] array = new int[n];
				
				for(int j = 0; j < n; j++) {
					int input = in.nextInt();
					array[j] = input;
				}
				System.out.println(angryProfessor(k, array));
			}
	}
}
