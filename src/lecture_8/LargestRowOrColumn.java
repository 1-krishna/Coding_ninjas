package lecture_8;

import java.util.Scanner;

public class LargestRowOrColumn {
	
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
	
	public static void findLargest(int input[][]){
		int row[]=new int[input.length];
		int col[]=new int[input[0].length];
		int sum=0;
		for(int i=0;i<input.length;i++){
			sum=0;
			for(int j=0;j<input[0].length;j++){
				sum+=input[i][j];
			}
			row[i]=sum;
		}
		
		for(int j=0;j<input[0].length;j++){
			sum=0;
			for(int i=0;i<input.length;i++){
				sum+=input[i][j];
			}
			col[j]=sum;
		}
		int max=0,index=0;
		String rc="";
		int op=0;
		for(int i=0;i<row.length;i++){
			if(max<row[i]){
				index=i;
				rc="row";
				op=row[i];
				max=row[i];
			}
		}
		
		for(int j=0;j<col.length;j++){
			if(max<col[j]){
				index=j;
				rc="column";
				op=col[j];
				max=col[j];
			}
		}
		System.out.println(rc+" "+index+" "+op);
	}

	public static void main(String[] args) {
		int arr[][]=take2d();
		
		findLargest(arr);
	}

}
