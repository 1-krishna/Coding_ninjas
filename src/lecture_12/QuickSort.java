package lecture_12;

import java.util.Scanner;

public class QuickSort {
	
	public static void quicksort(int[] input,int start, int end){
		if(start>=end){
			return;
		}
		
		int pivotIndex=getPivotIndex(input,start,end);
		quicksort(input, start, pivotIndex-1);
		quicksort(input, pivotIndex+1, end);
	}

	public static int getPivotIndex(int[] input, int start, int end) {
		//Find pivot index
		int pivot=input[start];
		int count=start;
		for(int i=start;i<=end;i++){
			if(input[i]<pivot){
				count+=1;
			}
		}
		int temp=input[count];
			input[count]=pivot;
			input[start]=temp;
		//arrange elements
		int i=start;
		int j=end;
		while(i<count){
			if(input[i]>=pivot){
				while(input[j]>=pivot){
					j--;
				}
				temp=input[i];
				input[i]=input[j];
				input[j]=temp;
			}
			i++;
		}
		return count;
		
		//return index
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
	
	public static void printArray(int input[]){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int input[]=takeInput();
		quicksort(input,0,input.length-1);
		printArray(input);

	}

}
