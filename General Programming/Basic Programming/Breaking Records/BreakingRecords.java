/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class BreakingRecords {
	
	static int[] breakingRecords(int[] scores) {
		
        int max = scores[0];
        int min = scores[0];
        int maxCount = 0;
        int minCount = 0;
        int[] results = new int[2];

        for(int i = 0; i < scores.length; i++){
            if(scores[i] > max){
                max = scores[i];
                maxCount++;
                results[0] = maxCount;
            }
            else if(scores[i] < min){
                min = scores[i];
                minCount++;
                results[1] = minCount;
            }

        }

        return results;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] scores = new int[n];
		
		for(int i = 0; i < n; i++) {
			scores[i] = in.nextInt();
		}
		
		int[] results = breakingRecords(scores);
		
		for(int i = 0; i < results.length; i++) {
			System.out.print(results[i] + " ");
		}
	}
}
