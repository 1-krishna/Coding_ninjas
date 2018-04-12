package L17;

import lecture_15.Node;

public class QueueUsingLinkList<T> {
	private Node<T> nextIndex,frontIndex;
	private int size;
	
	public QueueUsingLinkList() {
		nextIndex=null;
		frontIndex=null;
		size=0;
	}
	
	
	public void enqueue(T data){
		Node<T> a =new Node<T>(data);
		if(frontIndex==null && nextIndex==null){
			frontIndex=a;
			nextIndex=a;
		}
		else{
			nextIndex.next=a;
			nextIndex=a;
		}
		size++;
		
	}
	
	public T dequeue(){
		T data;
		data = frontIndex.data;
		
		if(frontIndex==nextIndex){
			frontIndex=null;
			nextIndex=null;
			size--;
			return data;
		}
		frontIndex=frontIndex.next;
		size--;
		return data;
	}
	
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public int size(){
		return size;
	}
	
}
