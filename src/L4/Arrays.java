package L4;

import java.util.Scanner;

public class Arrays {

	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		
		System.out.println("Function " + input);
		
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void printArray(int[] input) {
		for(int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}
	
	public static void test(int a, int b[]) {
		a = a + 10;
		b[0] = b[0] + 10;
	}
	
	public static void main(String[] args) {
		
		
		// Both statements are exactly same
		int [] a = new int[5];
		int b[] = new int[6];
		
		
		// Assume input is : 1, 2, 3, 4, 5
		int input[] = takeInput();
		
		int input1[] = {1, 2, 3, 4};
		
		
		System.out.println(input[0]);
		
		input = new int[3];
		System.out.println(input[0]);
		
		
		/*int a = 10;
		
		test(a, input);
		
		System.out.println(a);
		printArray(input);*/
		
		
//		System.out.println("Main " + input);
		
		
		
		
		
		
//		System.out.println(b);
		
//		System.out.println(b[0]);
		
		/*int a[];
		System.out.println(a);	// Not allowed
		*/
	}
}
