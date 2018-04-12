package arrays_1Assignment;

import java.util.Scanner;

public class Sort_0_1 {
	
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

	public static void sortBinaryArray(int[] arr){
		int i=0;
		int j=arr.length-1;
		int n=arr.length;
		while(i<j){
			if(arr[i]==0){
				i++;
			}
			if(arr[j]==1){
				j--;
			}
			else if(arr[i]==1 && arr[j]==0){
				arr[i]=0;arr[j]=1;
			}
			n--;
		}
		printArray(arr);

	}


	public static void main(String[] args) {
		int arr[]=takeInput();
		sortBinaryArray(arr);


	}

}
