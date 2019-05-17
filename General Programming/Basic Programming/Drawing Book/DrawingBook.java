import java.util.Scanner;

public class DrawingBook {
	
	public static int drawingBook(int n, int p) {
		
		int fromFront = p / 2;
		int fromBack = n / 2 - fromFront;
		return Math.min(fromFront, fromBack);
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		in.close();
		
		System.out.println(drawingBook(n, p));
	}

}
