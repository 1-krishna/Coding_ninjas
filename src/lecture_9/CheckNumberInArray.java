package lecture_9;

import java.util.Scanner;

public class CheckNumberInArray {
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
//		System.out.println(sum(arr));

	}

}
