package assignmentArrays_2;

import java.util.Scanner;

public class SumOfTwoArrays {
	
	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];

		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		
		return input;
	}
	
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		int len,e1=arr1.length-1,e2=arr2.length-1;
		if(arr1.length>arr2.length){
			len=arr1.length+1;
		}
		else{
			len=arr2.length+1;
		}
		int result[]=new int[len];
		int e3=len-1,carry=0,sum=0;
		
		while(e2>=0 && e1>=0){
			sum=carry+arr1[e1]+arr2[e2];
			result[e3]=sum%10;
			carry=sum/10;
			e1--;
			e2--;
			e3--;
			
		}
		if(arr1.length>arr2.length){
			while(e1>=0){
				sum=carry+arr1[e1];
				result[e3]=sum%10;
				carry=sum/10;
				e1--;
				e3--;
			}
		}
		
		if(arr2.length>arr1.length){
			while(e2>=0){
				sum=carry+arr2[e2];
				result[e3]=sum%10;
				carry=sum/10;
				e2--;
				e3--;
			}
		}
		result[e3]=carry;
		return result; 
		
		
	}

	public static void main(String[] args) {
		int arr1[]=takeInput();
		int arr2[]=takeInput();
		
		printArray(sumOfTwoArrays(arr1,arr2));

	}

}
