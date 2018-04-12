package lecture_9;

import java.util.Scanner;

public class IsSorted {
	
	public static boolean isSorted(int arr[]){
		//Edge case
		if(arr.length==0){
			return true;
		}
		//Base case
		if(arr.length==1){
			return true;
		}
		//Calculations
		if(arr[0]>arr[1]){
			return false;
		}
		int small[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++){
			small[i-1]=arr[i];
		}
		boolean ans=isSorted(small);
		return ans;
	}

	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		System.out.println(isSorted(arr));

	}

}
