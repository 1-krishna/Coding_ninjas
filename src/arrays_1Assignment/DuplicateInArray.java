package arrays_1Assignment;

import java.util.Scanner;

public class DuplicateInArray {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static int duplicate(int []arr){
		boolean n[]=new boolean[arr.length-1];
		for(int i=0;i<arr.length;i++){
			if(n[arr[i]]==false){
				n[arr[i]]=true;
			}
			else{
				n[arr[i]]=false;
			}
		}
		for(int i=0;i<n.length;i++){
			if(n[i]==false){
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		System.out.print(duplicate(arr));
		

	}

}
