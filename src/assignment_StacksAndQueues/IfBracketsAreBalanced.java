package assignment_StacksAndQueues;

import java.util.Scanner;
import lecture_16.StackUsingLL;

public class IfBracketsAreBalanced {
	public static boolean checkBalanced(String input){
		StackUsingLL<Character> a = new StackUsingLL<Character>(); 
		char element;
		
		for(int i = 0; i<input.length();i++){
			element=input.charAt(i);
			if((element==']' || element==')' || element=='}') && a.isEmpty()){
			    return false;
			}
			if(element=='(' || element=='{' || element=='['){
				a.push(element);
			}
			else if(element==')' && a.top()=='('){
				a.pop();
			}
			else if(element=='}' && a.top()=='{'){
				a.pop();
			}
			else if(element==']' && a.top()=='['){
				a.pop();
			}
			else if(element==']' || element==')' || element=='}'){
				return false;
			}
		}
		return a.isEmpty();
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(checkBalanced(input));
	}
}
