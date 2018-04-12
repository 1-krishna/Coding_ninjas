package test_2;

import java.util.Scanner;

public class StringsOfLengthK {

	public static void printArray(long input[]){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
		System.out.println("");
	}
	public static void printArray(int input[]){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
		System.out.println("");
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
	public static void printStarray(String[] input){
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}
	static String[] printAllKLengthRec(String input, int start, int k) {

		if(k==0 || start==input.length()){
			String res[]=new String[1];
			res[0]="";
			return res;
		}

		if(k==1){
			String res[]=new String[1];
			res[0]=input.charAt(start)+"";
			return res;
		}


		String res[]=printAllKLengthRec(input, start+1, k-1);
		String res1[]=printAllKLengthRec(input, start+1, k);
		String ans[]=new String[res.length+res1.length];
		int count=0;
		for(int i =0;i<res.length;i++){
			ans[i]=res[i]+input.charAt(start);
			count++;
		}
		for(int j=0;j<res1.length;j++){
			ans[count]=res1[j];
			count++;
		}
		return ans;
	}

	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		String input=s.next();
		int k=s.nextInt();
		printStarray(printAllKLengthRec(input,0,k));
	}

}
