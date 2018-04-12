package lecture_6;

import java.util.Scanner;

public class CountWords {
	
	
	public static int countWords(String str){
		int count=1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				count+=1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		System.out.println(countWords(str));
		

	}

}
