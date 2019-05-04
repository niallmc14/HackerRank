import java.util.HashSet;
import java.util.Scanner;

/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

public class SockMerchant {
	
	static int sockMerchant(int n, int[] ar) {
		
		HashSet<Integer> hashSet = new HashSet<>();
		int pairs = 0;
		
		for(int i = 0; i < n; i++) {
			
			if(hashSet.contains(ar[i])) {
				hashSet.remove(ar[i]);
				pairs++;
			}else {
				hashSet.add(ar[i]);
			}
		}
		return pairs;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		in.close();
		
		System.out.println(sockMerchant(n, arr));
	}

}
