package assignment_Strings;

import java.util.Scanner;

public class HighestOccuringCharacter {
	
	public static char highestOccuringCharacter(String inputString){
			int arr[]=new int[123];
			int temp;
			for(int i=0;i<inputString.length();i++){
				temp=(int)(inputString.charAt(i));
				arr[temp]+=1;
			}
			int max=arr[(int)(inputString.charAt(0))],index=(int)(inputString.charAt(0));
			int j=0;
			while(j<inputString.length()){
				temp=arr[inputString.charAt(j)];
				if(temp>max){
					max=temp;
					index=(int)(inputString.charAt(j));
				}
				j++;
				
			}
			return (char)(index);
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		String str=s.next();
		System.out.print(highestOccuringCharacter(str));
	}

}
