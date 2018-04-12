package programmingFundamentals_2;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int choice=s.nextInt();
		
		if(choice==1){
			System.out.println((n*(n+1))/2);
		}
		else if(choice==2){
			int product=1;
			for(int i=1;i<=n;i++){
				product=product*i;
			}
			System.out.println(product);
		}
		else{
			System.out.println("-1");
		}

	}

}
