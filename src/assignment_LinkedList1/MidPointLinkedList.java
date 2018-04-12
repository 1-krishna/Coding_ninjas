package assignment_LinkedList1;
import lecture_15.LinkedList;
import lecture_15.Node;

public class MidPointLinkedList {
	public static void main(String[] args) {
		Node<Integer> head = LinkedList.Input();
		Node<Integer> slow = head;
		Node<Integer> fast = head.next;
		
		while(fast!=null){
			
			if(fast.next==null){
				break;
			}
			
			fast=fast.next;
			slow=slow.next;
			if(fast.next==null){
				break;
			}
			fast=fast.next;
		}
		System.out.println(slow.data);
	}
}
