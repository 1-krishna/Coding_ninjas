package assignment_LinkedList1;

import java.util.Scanner;

import lecture_15.LinkedList;
import lecture_15.Node;

public class PalindromeLL {
	
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
	public static boolean isPalindrome_2(Node<Integer> head){
		Node<Integer> temp = head,temp1 = head;
		/*Scanner s=new Scanner(System.in);
		int data=s.nextInt();*/
		int data = temp.data;
		
		Node<Integer> previous=null;
		Node<Integer> headnew=null;
		while(true){
			Node<Integer> a = new Node<Integer>(data);
			if(headnew==null){
				headnew=a;
				previous=a;
			}
			else{
				previous.next=a;
				previous=previous.next;
			}
			temp=temp.next;
			if(temp==null){
				break;
			}
			data=temp.data;
			
		}
		
		headnew = reverse_I(headnew);
		while(temp1.next!=null){
			if(temp1.data!=headnew.data){
				return false;
			}
			temp1=temp1.next;
			headnew=headnew.next;
		}
		return true;
	}

	public static void main(String[] args) {
		Node<Integer> head = LinkedList.Input();
		
		System.out.println(isPalindrome_2(head));
		

	}

}
