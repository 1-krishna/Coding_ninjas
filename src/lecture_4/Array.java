package lecture_4;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int b[]=new int[5];
		// or int [] b = new int[5];
		System.out.println(b);
		//first denote array
		//second denotes integer
		//rest denotes array base address in hexadecimal form
		
		System.out.println(b[0]);//always initialize with zero(no garbage value)
		
		/*int a[];
		System.out.println(a);*///here a contains null so we can't print it
		
		Scanner s = new Scanner(System.in);
		int n=5;
		for(int i=0;i<n;i++){
			//if we put =n instead of <n then we get error of array out of
			//bounds
			b[i]=s.nextInt();
			
		}
				
		
	}

}
