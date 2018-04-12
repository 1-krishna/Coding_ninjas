package lecture_15;

import java.util.Scanner;

public class LinkedList {
	public static Node<Integer> Input() {
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> previous=null;
		Node<Integer> head=null;
		while(data!=-1){
			Node<Integer> a = new Node<Integer>(data);
			if(head==null){
				head=a;
				previous=a;
			}
			else{
				previous.next=a;
				previous=previous.next;
			}
			data=s.nextInt();
		}
		return head;
		
	}
	
	public static void printLL(Node<Integer> head){
		Node<Integer> temp= head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
