package lecture_9;

import java.util.Scanner;

public class SumOfArray_Recursive {
	
	public static int sum(int input[]){
		if(input.length==1){
			return input[0];
		}
		int sum=0;
		int small[]=new int[input.length-1];
		for(int i=1;i<input.length;i++){
			small[i-1]=input[i];
		}
		sum+=input[0]+sum(small);
		return sum;
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
		System.out.println(sum(arr));

	}

}
