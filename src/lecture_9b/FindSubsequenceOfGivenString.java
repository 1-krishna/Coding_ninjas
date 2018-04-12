package lecture_9b;

import java.util.Scanner;

public class FindSubsequenceOfGivenString {
	
	public static void printStarray(String[] input){
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}
	
	public static String[] subsequence(String input,int start){
		if(start==input.length()){
			String zero[]=new String[1];
			zero[0]="";
			return zero;
		}
		
		
		String temp[]=subsequence(input,start+1);
		
		String arr[]=new String[temp.length*2];
		
		for(int i=0;i<temp.length;i++){
			arr[i]=temp[i];
		}
		for(int i=temp.length;i<arr.length;i++){
			arr[i]=input.charAt(start)+temp[i-temp.length];
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.next();
		printStarray(subsequence(input,0));
	}

}
