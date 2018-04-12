package assignment_LinkedList1;
import lecture_15.LinkedList;
import lecture_15.Node;

public class ReverseLinkListIterative {
	
	public static Node<Integer> reverse_I(Node<Integer> head){
		Node<Integer> temp2=head,copy=head,temp1=head.next;
		while(temp1.next!=null){
			temp2=copy;
			copy=temp1;
			temp1=copy.next;
			copy.next=temp2;
		}
		temp1.next=copy;
		head.next=null;
		return temp1;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = LinkedList.Input();
		Node<Integer> receive = reverse_I(head);
		LinkedList.printLL(receive);
		
		
		
	}
	
}
