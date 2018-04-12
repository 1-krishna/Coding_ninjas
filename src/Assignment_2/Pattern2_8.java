package Assignment_2;

import java.util.Scanner;

public class Pattern2_8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n=s.nextInt();
		int i=1;
		int incr=1;
		while(i<=n){
			int j=1;
			while(j<=i){
				if(j==1){
					System.out.print(incr);
				}
				else if(j==i){
					System.out.print(incr);
					incr++;
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
