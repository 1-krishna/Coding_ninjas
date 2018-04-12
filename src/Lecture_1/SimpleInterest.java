package Lecture_1;
import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter p:");
		int p=s.nextInt();
		System.out.println("Enter r:");
		int r=s.nextInt();
		System.out.println("Enter t:");
		int t=s.nextInt();
		
		/*int p=50;
		int r=5;
		int t=1;*/
		
		int intsi=(p*r*t)/100;
		
		double si=(p*r*t)/100.0;
		
		System.out.println("Simple Interest:"+si);
		System.out.println(intsi);
		System.out.println(p+" "+r+" "+t);
	}

}
