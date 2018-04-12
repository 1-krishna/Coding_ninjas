package assignment_Recursion2b;

import java.util.Scanner;

public class ReturnSubsetOfArray {

	public static int[][] subSets(int input[],int start){
		if(start==input.length){
			int ans[][]=new int[1][0];
			return ans;
		}

		int temp[][]=subSets(input,start+1);
		int ans[][]=new int[2*temp.length][];
		int counti=0,countj=0;
		for(int i=0;i<temp.length;i++){
			ans[counti]=new int[temp[i].length+1];
			ans[counti][0]=input[start];
			countj=0;
			for(int j=0;j<temp[i].length;j++){
				countj+=1;
				ans[counti][countj]=temp[i][j];

			}
			counti+=1;
		}
		for(int i=0;i<temp.length;i++){
			ans[counti]=new int[temp[i].length];
			countj=0;
			for(int j=0;j<temp[i].length;j++){
				
				ans[counti][countj]=temp[i][j];
				countj+=1;
			}
			counti+=1;
		}
		return ans;
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
	public static void print2d(int[][] input){
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input[i].length;j++){
				System.out.print(input[i][j]+" ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		int input[]=takeInput();
		print2d(subSets(input,0));

	}

}
