import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {
	
	static int maxToys(int[] prices, int k) {
		
		int sum = 0;
		int count = 0;
		
		Arrays.sort(prices);
		
		for(int i = 0; i < prices.length; i++) {
			
			k -= prices[i];
			if(k > 0) count++;
			if(k <= 0) return count;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int[] prices = new int[n];
				
		for(int i = 0; i < n; i++) {
			prices[i] = in.nextInt();
		}
		in.close();

		System.out.print(maxToys(prices, k));
	}

}
