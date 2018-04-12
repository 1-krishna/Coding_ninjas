package lecture_4;
import java.util.Scanner;

public class reverseOfArrayWithinSameArray {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static void reverse(int input[]){
		int temp;
		for(int i=0;i<((input.length)/2);i++){
			temp=input[i];
			input[i]=input[input.length-i-1];
			input[input.length-i-1]=temp;
		}
	}
	
	public static void printArray(int input[]){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		int arr[]=takeInput();
		reverse(arr);
		printArray(arr);
		
	}

}
