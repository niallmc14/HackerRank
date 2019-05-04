/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class JumpingClouds {
	
	static int jumpingClouds(int[] c) {
        
		int length = c.length;
        int jumps = -1;
        
        for(int i = 0; i < length; i++){
        	
            jumps++;
            if(i + 2 < length && c[i] % 2 == 0){
                i++;
            }
        }
        return jumps;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();	
		int[] c = new int[n];
		
		for(int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		
		in.close();
		
		System.out.print(jumpingClouds(c));
	}

}
