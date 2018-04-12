package programmingFundamentals_2;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int k=n;
		int rev=0;
		
		while(k>0){
			rev=10*rev+k%10;
			k=k/10;
		}
		System.out.println(rev);
	}

}
