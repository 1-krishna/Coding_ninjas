package lecture_16;

import lecture_15.Node;

public class StackUsingLL<T> {
	private Node<T> head;
	private int size;

	public StackUsingLL() {
		head=null;
		size=0;
	}

	public boolean isEmpty(){
		return size==0;
	}

	public int getSize(){
		return size;
	}

	public T top(){
		if(size==0){
			StackEmpty a = new StackEmpty();
			try {
				throw a;
			} catch (StackEmpty e) {
				System.out.println("Stack is empty");
				return null;
			}
		}
		else{
			return head.data;
		}
	}

	public void push(T element){
		Node<T> a = new Node<T>(element);
		a.next=head;
		head=a;
		size++;
	}

	public T pop(){
		if(size==0){
			StackEmpty a = new StackEmpty();
			try {
				throw a;
			} catch (StackEmpty e) {
				System.out.println("Stack is empty");
				return null;
			}
		}	
		T ans = head.data;
		head=head.next;
		size--;
		return ans;
	}


}

