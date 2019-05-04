/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class BeautifulDayAtTheMovies {
	
	static int beautifulDays(int i, int j, int k) {
		
		int count = 0;
		
		for(int x = i; x <= j; x++) {
			if(Math.abs(x - reverse(x)) % k == 0) {
				count++;
			}
		}
		return count;
		
	}
	
	static int reverse(int number) {
		
		StringBuilder s = new StringBuilder();
		s.append(number);
		s.reverse();
		return Integer.parseInt(s.toString());
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i = in.nextInt();
		
		int j = in.nextInt();
		
		int k = in.nextInt();
		in.close();
		System.out.println(beautifulDays(i, j, k));
	}
}
