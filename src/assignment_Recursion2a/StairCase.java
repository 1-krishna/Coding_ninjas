package assignment_Recursion2a;

import java.util.Scanner;

public class StairCase {
	
	public static int findWays(int n){
		if(n==0){
			return 1;
		}
		
		int ans=1;
		
		if(n>=3){
			ans*=3;
		}
		
		else if(n>=2){
			ans*=2;
		}
		else if(n>=1){
			ans*=1;
		}
		int temp=findWays(n-1);
		
		
		return temp+ans;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(findWays(n));

	}

}
