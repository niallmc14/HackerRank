import java.util.*;

public class UtopianTree {
	
	public static int utopianTree(int n) {
		
		int cycles = 1;
		
		for(int i = 0; i < n; i++) {
			
			if(i % 2 != 0) 
				cycles += 1;
			
			else if (i % 2 == 0) 
				cycles *= 2;
			
		}
		
		return cycles;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		System.out.println(utopianTree(n));
		
	}

}
