package lecture_9b;

import java.util.Scanner;

public class MergeSort_UsingRecursion {

	public static int[] merge(int arr1[], int arr2[]){

		int i=0,j=0,maxlen;
		maxlen=arr1.length+arr2.length;

		int c[]=new int[maxlen];
		int upto=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<=arr2[j]){
				c[upto]=arr1[i];
				i++;
			}
			else{
				c[upto]=arr2[j];
				j++;
			}
			upto++;
		}
		for(int k=upto;k<maxlen;k++){
			if(i<arr1.length){
				c[k]=arr1[i];
				i++;
			}
			else if(j<arr2.length){
				c[k]=arr2[j];
				j++;
			}
		}
		return c;			

	}
	
	public static void printArray(int input[]){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
	}


	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];

		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}

		return input;
	}
	
	public static void mergeSort(int[] input){
		if(input.length==1){
			return;
		}
		
		int l=input.length;
		
		int a1[]=new int[l/2];
		int a2[]=new int[l - l/2];
		
		for(int i=0;i<l/2;i++){
			a1[i]=input[i];
		}
		for(int i=0;i<l-l/2;i++){
			a2[i]=input[l/2+i];
		}
		
		mergeSort(a1);
		mergeSort(a2);
		
		 int temp[] = merge(a1,a2);
		 for(int i=0;i<l;i++){
			 input[i]=temp[i];
		 }
		
	}


	public static void main(String[] args) {
		
		int arr[]=takeInput();
		mergeSort(arr);
		printArray(arr);
	}

}
