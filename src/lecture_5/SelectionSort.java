package lecture_5;

import java.util.Scanner;

public class SelectionSort {
	
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
		System.out.println();
	}
	
	public static void selectionSort(int arr[]){
		int min,index=0,temp;
		for(int i=0;i<arr.length-1;i++){
			index=i;
			min=arr[i];
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
					min=arr[j];
					index=j;
				}
			}
			temp=arr[i];
			arr[i]=min;
			arr[index]=temp;
			printArray(arr);
			
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		selectionSort(arr);

	}

}
