package assignmentArrays_2;

import java.util.Scanner;
import java.util.Arrays;
public class Sort_0_1_2 {
	
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
	
	public static void sort012(int arr[]){
		Arrays.sort(arr);
		printArray(arr);
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		sort012(arr);
		

	}

}
