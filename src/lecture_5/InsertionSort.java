package lecture_5;

import java.util.Scanner;

public class InsertionSort {

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
		System.out.println("");
	}

	public static void insertionSort(int arr[]){
		int temp,j;
		for(int i=1;i<arr.length;i++){
			j=i-1; temp=arr[i];
			while(j>=0){
				if(arr[j]>temp){
					arr[j+1]=arr[j];
					j--;
				}
				else{
					break;
				}
			}
			arr[j+1]=temp;
			
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		insertionSort(arr);



	}

}
