package lecture_5;

import java.util.Scanner;

public class MergeTwoSortedArrays {
	

	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];

		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		
		return input;
	}

	public static void printArray(int input[]){
		System.out.println(input.length);
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
		System.out.println("");
	}
	
	public static int[] merge(int []arr1,int []arr2){
		int i=0,j=0,maxlen;
		maxlen=arr1.length+arr2.length;
		
		int c[]=new int[maxlen];
		int var=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<=arr2[j]){
				c[var]=arr1[i];
				i++;
			}
			else{
				c[var]=arr2[j];
				j++;
			}
			var++;
		}
		for(int k=var;k<maxlen;k++){
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

	public static void main(String[] args) {
		int arr1[]=takeInput();
//		System.out.println("2nd");
		int arr2[]=takeInput();
		int c[]=merge(arr1,arr2);
		printArray(c);

	}

}
