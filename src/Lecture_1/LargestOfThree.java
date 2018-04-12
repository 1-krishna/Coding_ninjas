package Lecture_1;
import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		
				
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		//METHOD 2
		
		/*if(a>=b && a>=c){
			System.out.println(a);
		}
		else{
			if(b>=a && b>=c){
				System.out.println(b);
			}
			else{
				System.out.println(c);
			}
		}*/
		
		//METHOD 1
		
		/*if(a>=b && a>=c){
			System.out.println(a);
			return; //To terminate the program
		}
		
		if(b>=a && b>=c){
			System.out.println(b);
			return;
		}
		System.out.println(c);*/
		
	}

}
