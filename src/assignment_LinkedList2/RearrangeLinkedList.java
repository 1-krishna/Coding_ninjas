package assignment_LinkedList2;

import lecture_15.LinkedList;
import lecture_15.Node;

public class RearrangeLinkedList {

	 public static Node<Integer> reverse(Node<Integer> head){
	        if(head.next==null){
				return head;
			}
			
			Node<Integer> temp = reverse(head.next);
			Node<Integer> ans = temp;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=head;
			head.next=null;
			return ans;
	    }
		
		public static Node<Integer> changelist(Node<Integer> head) {
			Node<Integer> revHead=null;
			Node<Integer> point=null;
			Node<Integer> crack = head;
			while(crack!=null){
				Node<Integer> a = new Node<Integer>(crack.data);
				if(revHead==null){
					revHead=a;
					point=a;
				}
				else{
					point.next=a;
					point=point.next;
				}
				crack=crack.next;
			}
			revHead = reverse(revHead);
			
			/*while(revHead!=null){
			    System.out.print(revHead.data+" ");
			    revHead=revHead.next;
			}*/
			
			Node<Integer> temp = head;
			int length=0;
			
			while(temp!=null){
			    length++;
			    temp=temp.next;
			}
			temp=head;
			Node<Integer> tempNext=null;
			Node<Integer> revNext=null;
			for(int i = 0 ; i< length/2;i++){
			    
			    if(tempNext!=null){
			        temp=tempNext;
			        revHead=revNext;
			    }
			    
			    tempNext=temp.next;
			    revNext=revHead.next;
			    temp.next=revHead;
			    revHead.next=tempNext;
			   /* ListNode<Integer> a = new ListNode<Integer>(temp.data);
			    ListNode<Integer> b =new ListNode<Integer>(revHead.data);
			    b.next=temp.next;
			    a.next=b;
			    a=a.next;
			    temp=temp.next;
			    revHead=revHead.next;*/
			}
			tempNext.next=null;
			return head;

		}
		
		public static void main(String[] args) {
			Node<Integer> head = LinkedList.Input();
			Node<Integer> result = changelist(head);
			LinkedList.printLL(result);
			

		}
	
}
