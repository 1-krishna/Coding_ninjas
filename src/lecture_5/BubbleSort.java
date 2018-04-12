package lecture_5;

import java.util.Scanner;

public class BubbleSort {
	
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
			System.out.println(input[i]);
		}
	}
	
	public static void bubbleSort(int []arr){
		int temp=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		bubbleSort(arr);
		

	}

}
