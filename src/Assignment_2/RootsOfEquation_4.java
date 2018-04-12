package Assignment_2;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.floor;
import static java.lang.Math.round;

public class RootsOfEquation_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		double k=b*b-4*a*c;
		double d=sqrt(k);
		if(k>0.0){
			System.out.println("1");
			System.out.print((int)round((-b+d)/(2.0*a))+" "+(int)round((-b-d)/(2.0*a)));
		}
		else if(k==0.0){
			System.out.println("0");
			System.out.print((int)round((-b+d)/(2.0*a))+" "+(int)round((-b-d)/(2.0*a)));
		}
		else{
			System.out.print("-1");
		}
	}

}
