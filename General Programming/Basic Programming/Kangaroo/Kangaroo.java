import java.util.Scanner;

public class Kangaroo {
	
	static String kangaroo(int x1, int v1, int x2, int v2) {
        
		while(x1 <= x2){
            if(x1 == x2){
                return "YES";
            }

            x1 += v1;
            x2 += v2;
        }
        return "NO";
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x1 = in.nextInt();
		
		int v1 = in.nextInt();
		
		int x2 = in.nextInt();
		
		int v2 = in.nextInt();
		
		in.close();
		
		System.out.print(kangaroo(x1, v1, x2, v2));
	}
}
