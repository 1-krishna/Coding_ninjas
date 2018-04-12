package assignment_Recursion2b;

import java.util.Scanner;

public class ReturnPermutationsOfString {

	public static void printStarray(String[] input){
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}
	
	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		return n*factorial(n-1);
	}

	public static String[] permutationOfString(String input){
		if(input.length()==0){
			String ans[]={""};
			return ans;
		}

		String big[]=new String[factorial(input.length())];
		int count=0;
		
		for(int i=0;i<input.length();i++){
			String sub[]=permutationOfString(input.substring(0, i)+input.substring(i+1));

			
			for(int j=0;j<sub.length;j++){
				big[count]=input.charAt(i)+sub[j];
				count+=1;
			}
		}
		return big;
	}
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		String input=s.next();
		printStarray(permutationOfString(input));

	}

}
