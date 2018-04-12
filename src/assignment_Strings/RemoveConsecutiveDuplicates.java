package assignment_Strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String input){
		char temp=input.charAt(0);
		String r=input.charAt(0)+"";
		for(int i=1;i<input.length();i++){
			if(input.charAt(i)!=temp){
				r=r+input.charAt(i);
				temp=input.charAt(i);
			}
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		System.out.print(removeConsecutiveDuplicates(str));

	}

}
