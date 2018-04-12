package arrays_1;

import java.util.Scanner;

public class LinearSearch {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static int search(int arr[],int num){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int arr[]=takeInput();
		int k=s.nextInt();
		System.out.print(search(arr,k));
		
	}

}
