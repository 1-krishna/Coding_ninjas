package programmingFundamentals_1;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		char name=s.next().charAt(0);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		System.out.println(name);
		System.out.print((int)((a+b+c)/3));

	}

}
