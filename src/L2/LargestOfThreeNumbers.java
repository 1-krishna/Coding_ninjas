package L2;
import java.util.Scanner;


public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		
		if(a >= b && a >= c) {
			System.out.println(a);
		}
		else if(b >= a && b >= c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
		
		/*if(a >= b && a >= c) {
			System.out.println(a);
		}
		else {
			if(b >= a && b >= c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}*/
		
		
		/*if(a >= b && a >= c) {
			System.out.println(a);
			return;			// To terminate the program
		}
		
		if(b >= a && b >= c) {
			System.out.println(b);
			return;
		}
		
		System.out.println(c);*/
		
		
		
		
		
		
		
		
		
		
	}
}
