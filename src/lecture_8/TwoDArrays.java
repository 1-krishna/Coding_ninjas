package lecture_8;

import java.util.Scanner;

public class TwoDArrays {
	
	public static void print2d(int[][] input){
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input[i].length;j++){
				System.out.println(input[i][j]);
			}
		}
	}
	
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
		Scanner s=new Scanner(System.in);
		int b[][]=new int[3][2];
		System.out.println(b);//address stored at master location
		System.out.println(b[0]);//address stored at 1d array from b
		System.out.println(b[1]);
		
		int b1[][]=new int[4][];
		System.out.println(b);
		System.out.println(b1[0]);
		
		for(int i=0;i<4;i++){
			int x=s.nextInt();
			b1[i]=new int[x];
			for(int j=0;j<x;j++){
				b1[i][j]=s.nextInt();
			}
		}
		
		b1[0]=new int[8];
		System.out.println(b1[0]);
		
		int c[][]={{1,2,3,4},{5,6}};
		print2d(c);
		
	}

}
