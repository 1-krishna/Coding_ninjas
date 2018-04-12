package assignment_StacksAndQueues;

import lecture_16.StackUsingLL;
import java.util.Stack;

public class ReverseStack {
	
	public static void reverseStack(StackUsingLL<Integer> s1, StackUsingLL<Integer> s2){
		if(s1.isEmpty()){
			return;
		}
		int value = s1.pop();
//		s2.push(value);
		reverseStack(s1, s2);
//		value = s2.pop();
		s2.push(value);
		
		
		
	}

	public static void main(String[] args) {
		StackUsingLL<Integer> s1 = new StackUsingLL<Integer>();
		StackUsingLL<Integer> s2 = new StackUsingLL<Integer>();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		reverseStack(s1, s2);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		Stack<Integer> p =new Stack<Integer>();
		
		
	}

}
