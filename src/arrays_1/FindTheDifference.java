package arrays_1;

import java.util.Scanner;

public class FindTheDifference {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static int findDifference(int[] input){
		int sumodd=0,sumeven=0;
		for(int i=0;i<input.length;i++){
			if(i%2==0){
				sumeven+=input[i];
			}
			else{
				sumodd+=input[i];
			}
		}
		return (sumeven-sumodd);
	}

	public static void main(String[] args) {
		
		int arr[]=takeInput();
		System.out.print(findDifference(arr));
	}

}
