package programmingFundamentals_2;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int i=0,count=n;
		
		while(count>0){
			i++;
			if((3*i+2)%4!=0){
				System.out.print((3*i+2)+" ");
				count--;
			}
			
		}

	}

}
