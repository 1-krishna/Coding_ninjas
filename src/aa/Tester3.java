package aa;

import java.util.Scanner;

public class Tester3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		double d = s.nextDouble();
		s.nextLine();
		String str = s.nextLine();
		System.out.println("String ="+str);
		System.out.println("Double="+d);
		System.out.println("Integer="+i);
		s.close();

	}

}
