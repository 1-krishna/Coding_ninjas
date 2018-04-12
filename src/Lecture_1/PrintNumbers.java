package Lecture_1;
import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		
		int NumberToBePrinted=1;
		
		while(NumberToBePrinted<=n){
			System.out.println(NumberToBePrinted);
			NumberToBePrinted+=1;
		}

	}

}
