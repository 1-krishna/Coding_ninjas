package Assignment_2;

import java.util.Scanner;

public class Pattern4_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int i = 1;
		int j,temp;

		while(i<=n){
			j=n;
			temp=n;
			while(j>=i){

				System.out.print(n-(temp-1));
				j--;
				temp--;

			}
			System.out.println("");
			i++;
		}
	}

}
