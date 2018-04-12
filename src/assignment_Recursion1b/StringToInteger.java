package assignment_Recursion1b;

import java.util.Scanner;

public class StringToInteger {
	
	 public static int convertStringToInt(String input,int start){
		 if(start==0){
			 return (int)(input.charAt(start))-48;
		 }
		 
		 int number = convertStringToInt(input,start-1);
		 int temp= ((int)(input.charAt(start))-48)+number*10;
		 return temp;
	 }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(convertStringToInt(str,str.length()-1));
	}

}
