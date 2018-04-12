package arrays_1Assignment;

import java.util.Scanner;
import java.util.Arrays;

public class PairSumInArray {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static void pairSum(int[] arr,int n){
		Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++){
	    	for(int j=i;j<arr.length;j++){
	    		if(arr[i]+arr[j]==n){
	    			System.out.println(arr[i]+" "+arr[j]);
	    		}
	    	}
	    }
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=takeInput();
		int n=s.nextInt();
		pairSum(arr,n);
		
		

	}

}
