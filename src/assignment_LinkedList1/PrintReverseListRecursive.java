package assignment_LinkedList1;

import lecture_15.LinkedList;
import lecture_15.Node;

public class PrintReverseListRecursive {
	
public static void printReverseRecursive(Node<Integer> head) {
		
		if(head.next==null){
			System.out.println(head.data);
			return;
		}
		
		printReverseRecursive(head);
		System.out.println(head.data);
		
		return;
		
		
		
		
	}

	public static void main(String[] args) {
		Node<Integer> head = LinkedList.Input();
		
		printReverseRecursive(head);
		
		

	}

}
