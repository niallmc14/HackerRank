import java.util.Scanner;

public class CamelCase {
	
	public static int camelCase(String s) {
		
		int count = 1;
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		
		int result = camelCase(s);
		
		System.out.print(result);
	}
}
