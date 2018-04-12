package programmingFundamentals_2;

import java.util.Scanner;
import java.lang.Math;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		long k=n,rev=0,rem,res=0;
		int length=0;
		while(k>0){
			rev=10*rev+k%10;
			k=k/10;
			length++;
		}
		
		for(int i = 0;i<length;i++){
			rem=n%10;
			res=(long)(res+Math.pow(2, i)*rem);
			n=n/10;
		}
		System.out.print(res);
		
		

	}

}
