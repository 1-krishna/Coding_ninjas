package lecture_8;

import java.util.Scanner;

public class RowWiseSum {
	
	public static int[][] take2d(){
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int arr[][]=new int[row][col];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[][]=take2d();
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=0;
			for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}

}
