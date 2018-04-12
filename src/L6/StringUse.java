package L6;

import java.util.Scanner;

public class StringUse {

	public static void printCharacters(String input) {
		for(int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String input = s.next();
		printCharacters(input);
		
		/*String s1 = "abc";
		
		String s2 = "ab";
		
		s2 = s2 + 'c';
		if(s1 == s2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}*/
		
		/*String s2 = "";
		for(int i = 0; i < s1.length(); i++) {
			s2 = s2 + s1.charAt(i);
		}*/
		
		
		
		
		
		
		/*String s2 = "xyz";
		
		s1 = "fgt";
		
		int a[] = {1, 2, 3, 4};
		
		a[2] = 100;
//		s1.charAt(0) = 'd';		// Not allowed
		
		s1 = s1 + s2;*/
		
		
		// CharAt
/*//		System.out.println(a[2]);
		System.out.println(s1.charAt(1));
		
		// Substring
		System.out.println(s1.substring(1, 3));
		System.out.println(s1.substring(1));
		
		// IndexOf
		s1 = "abac";
		System.out.println(s1.indexOf('x'));
		
		// StartsWith
		System.out.println(s1.startsWith("ba"));
		*/
		
		
		/*int b[] = {1, 2, 3, 4};
		String s2 = s.nextLine();	// def ghi
		String s3 = s.nextLine();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		int a3 = 10, b3 = 10;
		System.out.println(a3 + " " + b3);
		
		int a[] = new int[10];
		String s4 = new String("abc");
		String s5 = s1 + s2;	// abcdef ghi
*/		
		
		
		
		
		
		
		
	}
}
