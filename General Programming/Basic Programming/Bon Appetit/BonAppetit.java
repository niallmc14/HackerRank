/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonAppetit {
	
	static void bonAppetit(List<Integer> bill, int k, int b) {
		int sum = 0;
		
		for(int i = 0; i < bill.size(); i++) {
			
			if(i == k) {
				continue;
			}
			sum += bill.get(i);			
		}
		
		sum /= 2;
		
		if(sum == b) {
			System.out.println("Bon Appetit");
		}else {
			System.out.println(b - sum);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		List<Integer> bill = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			bill.add(in.nextInt());
		}
		
		int b = in.nextInt();
		
		in.close();
		
		bonAppetit(bill, k, b);
	}

}
