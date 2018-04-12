//Update Values to infinity after first intersection
package arrays_1Assignment;

import java.util.Scanner;

public class PrintArrayIntersection {
	
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		
		for(int i=0;i<n;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static void intersection(int arr1[],int arr2[]){
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr2[i]==arr1[j]){
					System.out.println(arr2[i]);
					arr2[i]=Integer.MAX_VALUE;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr1[]=takeInput();
		int arr2[]=takeInput();
		intersection(arr1,arr2);
		
		

	}

}
