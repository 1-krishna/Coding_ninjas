package Assignment_2;

import java.util.Scanner;

public class SumOfOddEven_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		int div,evensum=0,oddsum=0;
		
		while(n!=0){
			div=n%10;
			if(div%2==0){
				evensum+=div;
			}
			else{
				oddsum+=div;
			}
			n=n/10;
		}
		System.out.print(evensum+" "+oddsum);

	}

}
