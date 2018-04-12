package lecture_4;

import java.util.Scanner;

public class largestElement {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static int largest(int input[]){
		int temp=input[0];
		for(int i=0;i<input.length;i++){
			if(temp<input[i]){
				temp=input[i];
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		int b[]=takeInput();
		int largest=largest(b);
		System.out.println(largest);

	}

}
