import java.util.Scanner;

public class CatAndMouse {
	
	public static String catAndMouse(int x, int y, int z) {
		
		int xToZ = Math.abs(z - x);
		int yToZ = Math.abs(z - y);
		
		if(xToZ < yToZ) 
			return "Cat A";
		else if(xToZ > yToZ)
			return "Cat B";
		else
			return "Mouse C";
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		in.close();
		
		String result = catAndMouse(x, y, z);
		
		System.out.print(result);
	}
}
