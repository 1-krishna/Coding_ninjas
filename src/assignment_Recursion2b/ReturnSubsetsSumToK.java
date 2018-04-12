package assignment_Recursion2b;

import java.util.Scanner;

public class ReturnSubsetsSumToK {

	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i =0 ;i<n;i++){
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void print2d(int[][] input){
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input[i].length;j++){
				System.out.print(input[i][j]+" ");
			}
			System.out.println("");
		}
	}

	public static int[][] subSetsK(int input[],int start,int k){
		if(start==input.length || k==0){
			int[][] ans=new int[1][0];
			return ans;
		}
		
		if(input[start]<k){
			int ans[][]=subSetsK(input, start+1, k-input[start]);
			int res[][]=new int[ans.length][];
			for(int i=0;i<ans.length;i++){
				res[i]=new int[ans[i].length+1];
				res[i][0]=input[start];
				for(int j=0;j<ans[i].length;j++){
					res[i][j+1]=ans[i][j];
				}
			}
			return res;
		}
		else{
			int ans[][]=subSetsK(input, start+2, k);
			return ans;
		}
	}
	
	public static void main(String[] args) {

		int input[]=takeInput();
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		print2d(subSetsK(input,0,k));

	}

}
