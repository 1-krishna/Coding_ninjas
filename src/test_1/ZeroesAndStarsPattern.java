package test_1;

import java.util.Scanner;

public class ZeroesAndStarsPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n=s.nextInt();
		int loop=2*n+1;
		int i=1;
		int j=1,l1=loop;

		while(i<=n){
			j=1;
			while(j<=loop){
				if(j==i || j==loop-i+1 || j==((loop/2)+1)){
					System.out.print("*");
				}
				else{
					System.out.print("0");
				}
				j++;
			}
			System.out.println("");
			i++;
		}
	}


}


