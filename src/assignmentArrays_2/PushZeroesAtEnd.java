package assignmentArrays_2;

import java.util.Scanner;

public class PushZeroesAtEnd {

	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];

		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}

	public static void printArray(int input[]){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
	}

	public static void pushZeroesAtEnd(int arr[]){
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[j]=arr[i];
				j++;
			}
		}
		for(int i=j;i<arr.length;i++){
			arr[i]=0;
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		pushZeroesAtEnd(arr);


	}

}
