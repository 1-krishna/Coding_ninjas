package lecture_14;

import java.util.Scanner;

public class PrintDictionaryOrderToNNumbers {
	public static void printer(int n, int ans,int counter){
		if(ans==n-1){
			System.out.println(ans);
			return;
		}
		if(ans<=n){
			System.out.println(ans);
			printer(n, ans*10,counter);
		}
		if(ans>n){
			ans=ans/10;
			if(counter == 10){
				System.out.println(ans/10+1);
				counter=0;
			}
			printer(n, ans+1,counter+1);
		}
		
		
	}



	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		printer(n,1,0);
	}
}
