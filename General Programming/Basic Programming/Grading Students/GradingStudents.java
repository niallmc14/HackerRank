/**
 * Author: Niall Mc Guinness
 * GitHub: github.com/niallmc14
 */

import java.util.Scanner;

public class GradingStudents {
	
	static int[] gradingStudents(int[] grades) {
		
		for(int i = 0; i < grades.length; i++) {
			
			if(grades[i] >= 38) {
				int newGrade = grades[i] % 5;
				if(newGrade > 2) {
					grades[i] += 5 - newGrade;
				}
			}
		}
		return grades;
	}
	
	static void printArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] grades = new int[n];
		
		for(int i = 0; i < n; i++) {
			int input = in.nextInt();
			grades[i] = input;
		}
		gradingStudents(grades);
		printArray(grades);
	}

}
