package Lecture_1;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int i=2;
		while(i<n){
			if(n%i==0){
				System.out.println("Non Prime Number");
				return;
			}
			i++;
		}
		System.out.println("Prime Number");

	}

}
