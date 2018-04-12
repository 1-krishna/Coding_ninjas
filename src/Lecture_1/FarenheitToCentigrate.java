package Lecture_1;
import java.util.Scanner;

public class FarenheitToCentigrate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int start=s.nextInt();
		int end=s.nextInt();
		int gap=s.nextInt();
		
		int i = start;
		int temp;
		
		while(i<=end){
			System.out.print(i+"\t");
			temp=(int)((5/9.0)*(i-32));
			System.out.println(temp);
			i+=gap;
		}

	}

}
