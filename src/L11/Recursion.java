package L11;

public class Recursion {

	public static void printSubsequences(String input, String ans) {
		if(input.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		String newOutput = ans + input.charAt(0);
		
		printSubsequences(input.substring(1), ans);
		printSubsequences(input.substring(1), newOutput);
	}
	
	public static void printSubsequences(String input) {
		printSubsequences(input, "");
	}
	
	public static void main(String[] args) {
		String input = "abc";
		printSubsequences(input, "");
	}
}
