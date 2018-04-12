package L8;

import java.util.Scanner;

public class TwoDArrays {

	// Rows = input.length
	// Columns of ith row : input[i].length
	public static void printArray(int[][] input) {
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input[i].length; j++) {
				System.out.println(input[i][j]);
			}
		}
	}
	
	public static int[][] test() {
		int input[][] = new int[4][5];
		return input;
	}
	
	public static void main(String[] args) {
		int b[][] = new int[3][2];
		
		int x1[] = {1, 2, 3, 4};
		
		int y[][] = {{1, 2, 3}, {4, 5}};
		
		System.out.println(y.length);
		System.out.println(y[0].length);
		
		/*Scanner s = new Scanner(System.in);
		System.out.println(b);
		System.out.println(b[0]);
		
		int b1[][] = new int[3][];
		for(int i = 0; i < 3; i++) {
			int x = s.nextInt();	// x = 5 2 1
			b1[i] = new int[x];	 	// If missed, null pointer exception
			
			for(int j = 0; j < x; j++) {
				b1[i][j] = s.nextInt();
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(b1[0][1]);
		
		/*int a[] = new int[4];
		
		int a1[];
		
		int b1[][];*/
		
		
		
	}
}
