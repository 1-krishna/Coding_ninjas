package assignment_Recursion2a;

import java.util.Scanner;

public class BinarySearchRecursive {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static void printArray(int[] input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
		System.out.println("");
	}
	
	public static int BinarySearch(int[] a, int start, int end, int target) {
	    int middle = (start + end) / 2;
	    if(end < start) {
	        return -1;
	    } 

	    if(target==a[middle]) {
	        return middle;
	    } else if(target<a[middle]) {
	        return BinarySearch(a, start, middle - 1, target);
	    } else {
	        return BinarySearch(a, middle + 1, end, target);
	    }
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		Scanner s=new Scanner(System.in);
		int element = s.nextInt();
		System.out.println(BinarySearch(arr, 0,arr.length-1,element));

	}

}
