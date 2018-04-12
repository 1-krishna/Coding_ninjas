package test_1;

import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int i=n;
		int j=1;
		while(i>=1){
			j=n;
			i--;
			while(j>=1){
				if(j==(n-i)){
					System.out.print("*");
				}
				else{
					System.out.print(j);
				}
				j--;
			}
			System.out.println("");
			//i--;
		}

	}

}
