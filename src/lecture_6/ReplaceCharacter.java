package lecture_6;

import java.util.Scanner;

public class ReplaceCharacter {
	
	public static String replaceCharacter(String input, char c1, char c2){
		String result="";
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==c1){
				result=result+c2;
			}
			else{
				result=result+input.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		String str=s.next();
		char c1=s.next().charAt(0);	
		char c2=s.next().charAt(0);
		System.out.print(replaceCharacter(str,c1,c2));
	}

}
