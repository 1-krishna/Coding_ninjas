package assignment_Strings;

import java.util.Scanner;

public class CompressTheString {
	
	public static String compress(String inputString){
		int count=1;
		char temp=inputString.charAt(0);
		String r=inputString.charAt(0)+"";
		
		for(int i=1;i<inputString.length();i++){
			if(inputString.charAt(i)==temp){
				count+=1;
			}
			else if(count!=1){
				r=r+count;
				count=1;
			}
			if(count==1){
				r=r+inputString.charAt(i);
			}
			temp=inputString.charAt(i);
		}
		if(count!=1){
			r+=count;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		
		System.out.print(compress(str));

	}

}
