package Lecture_1;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		
		int i=1;
		int k=1;
		
		while(i<=n){
			int j=0;
			while(j<i){
				System.out.print(k+" ");
				k++;
				j++;
			}
			i++;
			System.out.println("");
			
			
		}

	}

}
