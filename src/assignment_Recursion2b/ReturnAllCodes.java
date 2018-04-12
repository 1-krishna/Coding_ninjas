package assignment_Recursion2b;

import java.util.Scanner;


public class ReturnAllCodes {

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

	public static  String[] GetCode(String input,int start){
		if(start==input.length()-1){
			String ans[]=new String[1];
			ans[0] = findchars(convertStringToInt(input.substring(start, start+1)))+"";
			
			return ans;
		}
		if(start==input.length()-2){
			if(Integer.valueOf(input.substring(start, start+2))<=26){
				String res[]=new String[2];
				res[0]=findchars(convertStringToInt(input.substring(start, start+1)))+""+findchars(convertStringToInt(input.substring(start+1, start+2)));
				res[1]=findchars(convertStringToInt(input.substring(start, start+2)))+"";
				return res;
			}
			else{
				String ans[]=new String[1];
				ans[0]=findchars(convertStringToInt(input.substring(start, start+1)))+""+findchars(convertStringToInt(input.substring(start+1, start+2)));
				return ans;
			}
		}
		if(start==input.length()){
			String ans[]=new String[1];
			ans[0]="";
			return ans;
		}
		
		if(Integer.valueOf(input.substring(start, start+2))<=26){
			String temp1[]=GetCode(input,start+1);
			String temp2[]=GetCode(input,start+2);
			String ans[]=new String[temp1.length+temp2.length];
			int count=0;
			for(int i=0;i<temp1.length;i++){
				ans[count]=findchars(convertStringToInt(input.substring(start, start+1)))+temp1[i];
				count+=1;
			}
			for(int j=0;j<temp2.length;j++){
				ans[count]=findchars(convertStringToInt(input.substring(start, start+2)))+temp2[j];
				count+=1;
			}
			return ans;


		}

		else{
			String temp1[]=GetCode(input,start+1);
			String ans[]=new String[temp1.length];
			for(int i=0;i<temp1.length;i++){
				ans[i]=findchars(convertStringToInt(input.substring(start, start+1)))+temp1[i];
			}
			return ans;
		}

	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		String str=s.next();
		printStarray(GetCode(str,0));

	}

}
