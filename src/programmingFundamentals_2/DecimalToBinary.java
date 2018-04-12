package programmingFundamentals_2;

import java.util.Scanner;
import java.lang.Math;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		long rem=0,res=0;
		int i=0;
		while(n>0){
			rem=n%2;
			res=(long)(Math.pow(10, i)*rem)+res;
			n=n/2;
			i++;
			
		}
		System.out.println(res);
	}

}
