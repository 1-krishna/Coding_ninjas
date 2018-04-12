package assignment_Recursion2b;

import java.util.Scanner;

public class PrintPermutationsOfString {
	public static void printStarray(String[] input){
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}
	
	public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
	
	public static void permute(String str, int l, int r)
	    {
	        if (l == r)
	            System.out.println(str);
	        else
	        {
	            for (int i = l; i <= r; i++)
	            {
	                str = swap(str,l,i);
	                permute(str, l+1, r);
	                str = swap(str,l,i);
	            }
	        }
	    }
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String input=s.next();
		permute(input, 0,input.length()-1);
	}

}
