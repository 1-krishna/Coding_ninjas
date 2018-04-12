package assignment_StacksAndQueues;

import java.util.Scanner;
/*import lecture_16.Stack;*/
import java.util.Stack;

public class CheckRedundantBrackets {
	
	public static boolean checkRedundantBrackets(String input){
		
		Stack<Character> a = new Stack<Character>();
		char element;
		
		for(int i=0;i<input.length();i++){
			element = input.charAt(i);
			if(element!=')'){
				a.push(element);
			}
			else if(element == ')' && a.peek()!='('){
				while(a.peek()!='('){
					a.pop();
				}
				a.pop();
			}
			/*else{
				return true;
			}*/
			
		}
		while(!a.empty()){
			element = a.pop();
			if(element == '('){
				return true;
			}
		}
		
		return false;
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		
		System.out.println(checkRedundantBrackets(input));
		
	}
}

