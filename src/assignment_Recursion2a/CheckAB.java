package assignment_Recursion2a;

import java.util.Scanner;

public class CheckAB {
	
	public static boolean checkAB(String input,int start){
		if(input.charAt(0)=='b'){
			return false;
		}
		
		if(start==input.length()){
			return true;
		}
		if(start==input.length()-1){
			if(input.charAt(start)=='a'){
				return true;
			}
			return false;
		}
		
		boolean ans=false;
		if(input.charAt(start)=='a'){
			if(input.charAt(start+1)=='a'){
				ans=checkAB(input,start+1);
			}
			else if(input.charAt(start+1)=='b' && input.charAt(start+2)=='b'){
				ans=checkAB(input,start+1);
			}
		}
		
		if(input.charAt(start)=='b'){
			if(input.charAt(start+1)=='b'){
				if(start+1==input.length()-1){
					return true;
				}
				if(input.charAt(start+2)=='a'){
					ans=checkAB(input,start+2);
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(checkAB(str,0));

	}

}
