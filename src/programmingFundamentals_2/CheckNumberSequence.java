package programmingFundamentals_2;

import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int k1=s.nextInt();
		int k2=s.nextInt();
		n-=2;
		int temp,i=0,state=0;
		int flag=0;
		int count=0;

		if(k1<k2){
			while(count<n){
				if(k1>k2){
					break;
				}

				k1=k2;
				k2=s.nextInt();
				n--;
				System.out.println(n);
			}
		}
		else{
			while(count<n){
				if(k1>k2){
					flag=1;
				}
				if(k1<k2 && flag==1){
					flag=2;
				}
				else{
					flag=3;
					break;
				}
				k1=k2;
				k2=s.nextInt();
				n--;
			}

		}
		if(flag==1 || flag==2 || n==0){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}

}
