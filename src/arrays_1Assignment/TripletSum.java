package arrays_1Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
	
	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];

		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		
		return input;
	}
	
	public static void FindTriplet(int[] arr, int x){
		
		int sum;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++){
			for(int j=i+1;j<arr.length-1;j++){
				sum=arr[i]+arr[j];
				for(int k=j+1;k<arr.length;k++){
					if(sum+arr[k]==x){
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=takeInput();
		int sum=s.nextInt();
		
		FindTriplet(arr,sum);

	}

}
