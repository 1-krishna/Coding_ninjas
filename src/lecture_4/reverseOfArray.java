package lecture_4;

import java.util.Scanner;

public class reverseOfArray {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static int[] reverse(int input[]){
		int rev[]=new int[input.length];
		for(int i=0;i<input.length;i++){
			rev[input.length-i-1]=input[i];
		}
		for(int i=0;i<input.length;i++){
			input[i]=rev[i];
		}
		return input;//here wew don't need to return array because modifications 
					//are done at same array.
	}
	
	public static void printArray(int input[]){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		int input[]=takeInput();
		int b[]=reverse(input);
		printArray(b);
		

	}

}
