/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class DesignerPDFViewer {
	
	static final int letters = 26;
	
	static int designPDFviewer(int[] h, String word) {
		
		int max = 0;
		
		for(int i = 0; i < word.length(); i++) {
			if(max < h[word.charAt(i) - 97]) {
				max = h[word.charAt(i) - 97];
			}
		}
		return max * word.length();
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] h = new int[letters];
		String word = in.next();

		for(int i = 0; i < letters; i++) {
			h[i] = in.nextInt();
		}
		

		in.close();
		
		System.out.println(designPDFviewer(h, word));
	}
}
