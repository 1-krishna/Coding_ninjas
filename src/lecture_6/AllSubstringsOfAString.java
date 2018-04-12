package lecture_6;

import java.util.Scanner;

public class AllSubstringsOfAString {

	public static void printSubstrings(String str){
		String r="";
		for(int i=0;i<str.length();i++){
			r="";
			for(int j=i;j<str.length();j++){
				r+=str.charAt(j);
				System.out.println(r);
			}
		}
	}


	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);

		String str=s.next();
		printSubstrings(str);
	}
}
