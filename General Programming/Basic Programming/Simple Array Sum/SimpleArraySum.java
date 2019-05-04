/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class SimpleArraySum {
	
	//Function Declaration
	
	static int simpleArraySum(int[] array) {
		
		int sum = 0;
		
		//Loops through array adding each element to the current sum variable
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		//Save inputs from user
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		
		int result = simpleArraySum(array);
		
		System.out.print(result);
	}

}
