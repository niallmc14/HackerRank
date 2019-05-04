import java.util.Scanner;

public class CountingValleys {
	
	static int countingValleys(String s) {
		
		int step = 0;
		int result = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'U')
				step++;
			else
				step--;
			
			if(s.charAt(i) == 'U' && step == 0) {
				result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();

		in.close();
		
		System.out.print(countingValleys(s));
	}
}
