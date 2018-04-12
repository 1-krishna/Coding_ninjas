package assignmentArrays_2;

import java.util.Scanner;

public class CheckArrayRotation {
	
	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];

		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}

		return input;
	}
	
	public static int arrayRotateCheck(int[] arr){
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i+1]>=arr[i]){
				count++;
			}
			else{
				break;
			}
			
		}
		if(count!=arr.length-1){
			return count+1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		System.out.print(arrayRotateCheck(arr));

	}

}
