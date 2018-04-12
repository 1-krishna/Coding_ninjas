package arrays_1;

import java.util.Scanner;

public class SwapAlternate {
	
	public static void printArray(int input[]){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
	}
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static void swap(int[] input){
		int temp;
		for(int i=0;i<input.length;i++){
			if(i%2!=0){
				temp=input[i-1];
				input[i-1]=input[i];
				input[i]=temp;
			}
		}
		printArray(input);
	}

	public static void main(String[] args) {
		
		int arr[]=takeInput();
		swap(arr);
		
		
		
	}

}
