package lecture_6;

import java.util.Scanner;

public class MinimumLengthWord {

	public static String minLengthWord(String input){
		int len=0,minlen=Integer.MAX_VALUE,sst=0,sen=0,start=0,end=0;
		String r="";
		for(int i=0;i<input.length();i++){
			len++;
			end++;
			if(input.charAt(i)==' '){
				if(len<minlen){
					sst=start;
					sen=end;
					minlen=len;
				}
				start=end;
				len=0;
			}
		}
		for(int i=sst;i<sen;i++){
			r+=input.charAt(i);
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		String str=s.nextLine();

		System.out.print(minLengthWord(str));

	}

}
