/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class PlusMinus {
	
	 private static void calculateFraction(int[] arr) {
			int length = arr.length;
			float positiveNumberCount = 0;
			float negativeNumberCount = 0;

			for (int i = 0; i < length; i++) {
				if (arr[i] > 0)
					positiveNumberCount++;
				else if (arr[i] < 0)
					negativeNumberCount++;
			}

			System.out.printf("%.6f\n", positiveNumberCount / length);
			System.out.printf("%.6f\n", negativeNumberCount / length);
			System.out.printf("%.6f",
					(float) (length - (positiveNumberCount + negativeNumberCount))
							/ length);
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int arr[] = new int[n];

			for (int arr_i = 0; arr_i < n; arr_i++) {
				arr[arr_i] = in.nextInt();
			}
			in.close();

			calculateFraction(arr);
		}

}
