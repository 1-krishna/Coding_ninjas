package assignment_LinkedList1;

import java.util.Scanner;

import lecture_15.LinkedList;
import lecture_15.Node;

public class SwapTwoNodes {
	
	public static  Node<Integer> swap_nodes(Node<Integer> head,int i,int j){
		Node<Integer> p1=head,c1=head,p2=head,c2=head,x=null;
		
		while(i>0){
			p1=c1;
			c1=c1.next;
			i--;
		}
		while(j>0){
			p2=c2;
			c2=c2.next;
			j--;
		}
		x=c1.next;
		
		p1.next=p2.next;
		c1.next=c2.next;
		c2.next=x;
		p2.next=c1;
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = LinkedList.Input();
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
		Node<Integer> ans = swap_nodes(head, i, j);
		LinkedList.printLL(ans);

	}

}
