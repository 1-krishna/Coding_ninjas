package assignment_LinkedList1;

import lecture_15.LinkedList;
import lecture_15.Node;

public class EliminateDulplicateFromLL {
	
	public static Node<Integer> removeDuplicates(Node<Integer> head){
		if(head.next==null){
			return head;
		}
		Node<Integer> temp = head, tracer = null;
		int dataprev = head.data;
		head=head.next;
		int datacurr = head.data;
		
		
		while(head.next!=null){
			head = head.next;
			if(datacurr==dataprev){
				tracer = head;
				while(datacurr==dataprev && head.next!=null){
					dataprev=datacurr;
					head=head.next;
					datacurr=head.data;
				}
				if(head.next==null){
					break;
				}
				
				tracer.next=head;
				
			}
			
			dataprev = datacurr;
			datacurr = head.data;
			/*head=head.next;*/
		}
		return temp;
		
		
	}

	public static void main(String[] args) {
		
		Node<Integer> head = LinkedList.Input();
		Node<Integer> result = removeDuplicates(head);
		LinkedList.printLL(result);
		
	}

}
