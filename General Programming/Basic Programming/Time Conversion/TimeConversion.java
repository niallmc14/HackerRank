import java.util.Scanner;

public class TimeConversion{
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		
		int hours = Integer.parseInt(s.substring(0, 2));
		int minutes = Integer.parseInt(s.substring(3, 5));
		int seconds = Integer.parseInt(s.substring(6, 8));
		
		if(s.substring(8, 10).equals("PM") && hours != 12) {
			hours += 12;
		}
		else if(s.substring(8, 10).equals("AM") && hours == 12) {
			hours = 0;
		}
		
		System.out.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

}
