package test_1;

import java.lang.Math;
import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int p=n;
		int count=0;
		while(p!=0){
			p=p/10;
			count+=1;
		}
		
		int k=n;
		int sum=0,temp;
		
		while(k!=0){
			temp=k%10;
			
			sum+=Math.pow(temp,count);
			
			k=k/10;
			
		}
		if(sum==n){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}

}
