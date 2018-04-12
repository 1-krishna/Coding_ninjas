package assignment_Recursion_1a;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static boolean isStringPalindrome(String input) {
		if(input.length()==0 || input.length()==1){
			return true;
		}
		String str="";
		boolean flag=true;
		
		for(int i=1;i<input.length()-1;i++){
			str+=input.charAt(i);
		}
		System.out.println(str);
		if(input.charAt(0)==input.charAt(input.length()-1)){
			return isStringPalindrome(str);
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(isStringPalindrome(str));

	}

}
