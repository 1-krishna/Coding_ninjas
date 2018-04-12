package arrays_1;

import java.util.Scanner;

public class ArrangeNumbers {
	
	public static int[] arrange(int n){
		boolean flag=true;
		int count=0,tr=1,cr=0;;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			count++;
			if(flag==true){
				arr[cr]=count;
				flag=false;
				cr++;
				
			}
			else{
				arr[n-tr]=count;
				flag=true;
				tr++;
			}
		}
		return arr;
	}
	
	public static void printArray(int input[]){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		printArray(arrange(n));
		
	}

}
