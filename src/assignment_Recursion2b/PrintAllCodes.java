package assignment_Recursion2b;

import java.util.Scanner;

public class PrintAllCodes {
	
	public static int smallcode(String input,int start){
		if(start==0){
			return (int)(input.charAt(start))-48;
		}

		int number = smallcode(input,start-1);
		int temp= ((int)(input.charAt(start))-48)+number*10;
		return temp;

	}

	public static int convertStringToInt(String input){

		return (smallcode(input,input.length()-1));

	}

	public static char findchars(int rem){
		char ans=(char)(rem+96);
		return ans;
	}

	public static void printStarray(String[] input){
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}

	public static  void printAllCodes(String input,int end,String ans){
		if(end==1){
			if(Integer.valueOf(input.substring(end-1, end+1))<=26){
				String res1=ans;
				String res2=ans;
				res1= findchars(convertStringToInt(input.substring(end, end+1)))+""/*+findchars(convertStringToInt(input.substring(end+1, end+2)))*/+res1;
				res2=findchars(convertStringToInt(input.substring(end-1, end+1)))+res2 ;
			}
			else{
				
				ans=/*findchars(convertStringToInt(input.substring(end, end+1)))+*/""+/*findchars(convertStringToInt(input.substring(end+1, end+2)))+*/ans;
				
				
			}
		}
		else if(end==0){
			ans = findchars(convertStringToInt(input.substring(end, end+1)))+ans;
			
			System.out.println(ans);
			return;
		}
		
		else if(end<0){
			System.out.println(ans);
			return;
		}
		
		if(Integer.valueOf(input.substring(end-1,end+1))<=26){
			String ans1=findchars(convertStringToInt(input.substring(end, end+1)))+ans;
			String ans2=findchars(convertStringToInt(input.substring(end-1, end+1)))+ans;
			printAllCodes(input,end-1,ans1);
			printAllCodes(input,end-2,ans2);


		}

		else{
			ans=findchars(convertStringToInt(input.substring(end, end+1)))+ans;
			printAllCodes(input,end-1,ans);
		}

	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		String str=s.next();
		printAllCodes(str,str.length()-1,"");

	}


}
