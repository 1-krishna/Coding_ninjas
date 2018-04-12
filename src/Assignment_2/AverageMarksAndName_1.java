package Assignment_2;

import java.util.Scanner;

public class AverageMarksAndName_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		char name=s.next().charAt(0);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();

		int sum;

		if(a>=c && b>=c){
			sum=(a+b)/2;
		}
		else{
			if(b>=a && c>=a){
				sum=(b+c)/2;
			}
			else{
				sum=(a+c)/2;
			}


		}
		System.out.print(name+" "+sum);	

	}
}
