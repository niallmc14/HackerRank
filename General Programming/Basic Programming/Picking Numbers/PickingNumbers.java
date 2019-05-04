/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers {
	
	public static int pickingNumbers(List<Integer> a) {
        
        int[] counts = new int[100];
        int max = 2;

        for(int num : a){
            counts[num]++;
        }

        for(int i = 1; i < counts.length; i++){
            int adjSum = counts[i] + counts[i - 1];
            max = Math.max(max, adjSum);
        }
        
        return max;	
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			a.add(in.nextInt());
		}
		
		in.close();
		
		
	}

}
