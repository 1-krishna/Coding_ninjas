package lecture_4;

import java.util.Scanner;

public class functionToTakeInput {
	
	public static void printArray(int input[]){
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		//System.out.println("Function"+input);
		//to verify that only reference move to main function
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int input[]=takeInput();
		
		//System.out.println("Main"+input);
		printArray(input);//here base address in passed actually

	}

}
