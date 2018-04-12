package lecture_8;

import java.util.Scanner;

public class PrintSpiral {
	
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
	
	public static void spiralPrint(int matrix[][]){
		int counter=0;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(i+j==counter){
					System.out.print(matrix[i][j]+" ");
					counter++;
				}
			}
		}
		counter-=2;
		for(int i=matrix.length-1;i>0;i--){
			for(int j=matrix[0].length;j>=0;j--){
				if(i+j==counter){
					System.out.print(matrix[i][j]+" ");
					counter--;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[][]=take2d();
		
		spiralPrint(arr);

	}

}
