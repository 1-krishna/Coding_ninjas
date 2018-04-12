package lecture_9;

import java.util.Scanner;

public class MaxValueInArray_recursiveMethod {

	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static int max(int arr[],int max){
		if(arr.length==0){
			return max;
		}
		
		if(arr[0]>max){
			max=arr[0];
		}
		int ne[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++){
			ne[i-1]=arr[i];
		}
		int ans=max(ne,max);
		return ans;
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		System.out.println(max(arr,arr[0]));
}
}
