package assignment_LinkedList1;

import lecture_15.LinkedList;
import lecture_15.Node;

public class ReverseLinkedListRecursive {
	
	public static Node<Integer> reverse_R(Node<Integer> head) {
		
		if(head.next==null){
			return head;
		}
		
		Node<Integer> temp = reverse_R(head.next);
		Node<Integer> ans = temp;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return ans;
		
		
		
		
	}

	public static void main(String[] args) {
		Node<Integer> head = LinkedList.Input();
		
		Node<Integer> ans = reverse_R(head);
		
		LinkedList.printLL(ans);

	}

}
