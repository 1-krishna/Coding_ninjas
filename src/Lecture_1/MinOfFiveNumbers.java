package Lecture_1;
import java.util.Scanner;

public class MinOfFiveNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a1=s.nextInt();
		int a2=s.nextInt();
		int a3=s.nextInt();
		int a4=s.nextInt();
		int a5=s.nextInt();
		
		int min=a1;
		
		int i=1;
		
		if(a1<=a2 && a1<=a3 && a1<=a4 && a1<=a5){
			System.out.println(a1);
			return;
		}
		if(a2<=a1 && a2<=a3 && a2<=a4 && a2<=a5){
			System.out.println(a2);
			return;
		}
		if(a3<=a2 && a3<=a1 && a3<=a4 && a3<=a5){
			System.out.println(a3);
			return;
		}
		if(a4<=a2 && a4<=a3 && a4<=a1 && a4<=a5){
			System.out.println(a4);
			return;
		}
		System.out.println(a5);
		

	}

}
