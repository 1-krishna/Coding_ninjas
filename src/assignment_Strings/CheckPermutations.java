package assignment_Strings;

import java.util.Scanner;

public class CheckPermutations {

	public static boolean isPermutation(String input1, String input2){
		boolean flag=false;
		boolean arr[]=new boolean[input2.length()];
		if(input1.length()==input2.length()){
			for(int i=0;i<input1.length();i++){
				flag=false;
				for(int j=0;j<input2.length();j++){
					if(input1.charAt(i)==input2.charAt(j) && arr[j]==false){
						flag=true;
						arr[j]=true;
						break;
					}
				}
				if(flag==false){
					return false;
				}
			}
			
			/*for(int i=0;i<input2.length();i++){
				flag=false;
				for(int j=0;j<input1.length();j++){
					if(input2.charAt(i)==input1.charAt(j)){
						flag=true;
					}
				}
				if(flag==false){
					return false;
				}
			}*/
		}
		return flag;

	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		String str1=s.next();
		String str2=s.next();
		System.out.print(isPermutation(str1,str2));


	}

}
