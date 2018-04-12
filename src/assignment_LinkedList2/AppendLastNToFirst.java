package assignment_LinkedList2;

import lecture_15.LinkedList;
import lecture_15.Node;

public class AppendLastNToFirst {
	
	public static Node<Integer> append(Node<Integer> head, int n){
		Node<Integer> slow = head, fast = head;
		while(n>0){
			fast=fast.next;
			n--;
		}
		while(fast.next!=null){
			slow=slow.next;
			fast=fast.next;
		}
		Node<Integer> ans = slow.next;
		fast.next = head;
		slow.next = null;
		return ans;
		
		
	}

	public static void main(String[] args) {
		Node<Integer> head = LinkedList.Input();
		Node<Integer> result = append(head, 3);
		LinkedList.printLL(result);

	}

}
