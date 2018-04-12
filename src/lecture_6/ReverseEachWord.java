package lecture_6;

import java.util.Scanner;

public class ReverseEachWord {
	
	public static String reverseEachWord(String input) {
		String r="";
		int start=0,end=start;
		
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)!=' '){
			end+=1;	
			}
			else{
				for(int j=end-1;j>=start;j--){
					r=r+input.charAt(j);
				}
				r=r+" ";
				start=end+1;
				end=start;
			}
		}
		for(int i=input.length()-1;i>start;i--){
			r=r+input.charAt(i);
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(reverseEachWord(str));
		

	}

}
