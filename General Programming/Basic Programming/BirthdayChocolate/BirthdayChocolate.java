import java.util.*;

public class BirthdayChocolate {
	
	public static void main(String[] args) {
		
		int totalWays = 0;
		int[] sum = new int[110];
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		
		for(int i = 0; i < n; i++) {
			s[i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		in.close();
		sum[0] = 0;
		for(int i = 0; i < n; i++) { 
			sum[i + 1] = sum[i] + s[i];
		}
		
		for(int j = 0; j < n; j++) {

			if(sum[j + m] - sum[j] == d) {
				totalWays++;
			}
		}
		System.out.println(totalWays);
	}

}
