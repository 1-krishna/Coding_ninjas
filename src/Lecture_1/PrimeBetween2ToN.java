package Lecture_1;
import java.util.Scanner;

public class PrimeBetween2ToN {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		int t=s.nextInt();
		int i=2;
		int n=2;
		boolean flag=false;
		while(n<=t){
			while(i<n){
				if(n%i==0){
					flag = true;
					return;
				}
				i++;
				if(flag==false){
					System.out.println(n);
					n++;

				}
				flag=false;
			}
		}

	}


}
