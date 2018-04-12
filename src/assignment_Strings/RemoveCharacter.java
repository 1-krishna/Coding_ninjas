package assignment_Strings;

import java.util.Scanner;

public class RemoveCharacter {
	
	public static String removeAllOccurrencesOfChar(String input, char c){
		String r="";
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)!=c){
				r=r+input.charAt(i);
			}
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		char r=s.next().charAt(0);
		
		System.out.print(removeAllOccurrencesOfChar(str,r));

	}

}
