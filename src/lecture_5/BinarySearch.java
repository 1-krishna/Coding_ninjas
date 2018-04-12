package lecture_5;

import java.util.Scanner;

public class BinarySearch {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static int binarySearch(int arr[],int n){
		int st=0,end=arr.length-1,mid=(st+end)/2;
		
		while(st<=end){
			mid=(st+end)/2;
			if(arr[mid]==n){
				return mid;
			}
			else if(arr[mid]<n){
				st=mid+1;
			}
			else{
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]=takeInput();
		int n=s.nextInt();
		System.out.println(binarySearch(arr,n));
		
		
		

	}

}
