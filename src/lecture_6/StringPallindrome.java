package lecture_6;

import java.util.Scanner;

public class StringPallindrome {

	public static boolean checkPalindrome(String str){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==str.charAt(str.length()-i-1)){
				continue;
			}
			else{
				return false;
				}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		String str=s.next();
		System.out.print(checkPalindrome(str));

	}

}
