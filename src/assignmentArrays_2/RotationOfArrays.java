package assignmentArrays_2;

import java.util.Scanner;

public class RotationOfArrays {

	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];

		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}

		return input;
	}

	/*public static void rotate(int []arr,int d){
		for(int i=d;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<d;i++){
			System.out.print(arr[i]+" ");
		}
	}
*/
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void rotate(int[]arr,int d){
		for(int i=0;i<d;i++){
			for(int j=0;j<arr.length-1;j++){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		printArray(arr);
	} 
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=takeInput();
		int d=s.nextInt();
		rotate(arr,d);
	}

}
