package arrays_1;

import java.util.Scanner;

public class SumOfAllElements {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		
		int arr[]=takeInput();
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.print(sum);
	}

}
