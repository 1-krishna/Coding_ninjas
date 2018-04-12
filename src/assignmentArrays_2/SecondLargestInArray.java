package assignmentArrays_2;

import java.util.Scanner;

public class SecondLargestInArray {
	
	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];

		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		
		return input;
	}
	
	public static int secondLargestElement(int arr[]){
		int max=arr[0],index=0;
		
		for(int i =0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
				index=i;
			}
		}
		arr[index]=Integer.MIN_VALUE;
		max=arr[index];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		System.out.println(secondLargestElement(arr));

	}

}
