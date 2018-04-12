package arrays_1Assignment;

import java.util.Scanner;

public class findUnique {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static int findUnique(int input[]){
		int count=0;
		
		for(int i=0;i<input.length;i++){
			count=0;
			for(int j=0;j<input.length;j++){
				if(input[i]==input[j]){
					count++;
				}
				
			}
			if(count!=2){
				return input[i];
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		System.out.print(findUnique(arr));
		

	}

}
