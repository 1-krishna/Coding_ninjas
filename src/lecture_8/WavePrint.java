package lecture_8;

import java.util.Scanner;

public class WavePrint {
	
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
	
	public static void wavePrint(int input[][]){
		boolean flag=false;
		for(int j=0;j<input[0].length;j++){
			if(flag==false){
				for(int i=0;i<input.length;i++){
					System.out.print(input[i][j]+" ");
				}
				flag=true;
			}
			else{
				for(int i=input.length-1;i>=0;i--){
					System.out.print(input[i][j]+" ");
				}
				flag=false;
			}
		}
	}

	public static void main(String[] args) {
		int arr[][]=take2d();
		
		wavePrint(arr);

	}

}
