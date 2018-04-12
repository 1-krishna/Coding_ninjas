package Assignment_2;

import java.util.Scanner;

public class CaseCheck_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		char c=s.next().charAt(0);
		
		int t=(int)(c);
		
		if(t>=65 && t<=90){
			System.out.print("1");
		}
		else if(t>=97 && t<=122){
			System.out.print("0");
		}
		else{
			System.out.print("-1");
		}

	}

}
