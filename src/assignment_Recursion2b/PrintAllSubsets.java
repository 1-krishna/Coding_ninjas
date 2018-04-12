package assignment_Recursion2b;

import java.util.Scanner;

public class PrintAllSubsets {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static void printer(int[] input,int start,String ans){
		if(start==input.length){
			System.out.println(ans);
			return;
		}
		
		printer(input, start+1, ans);
		printer(input, start+1, ans+""+input[start]+" ");
		
	}
	
	public static void main(String[] args) {
		
		int input[]=takeInput();
		printer(input, 0, "");

	}

}
