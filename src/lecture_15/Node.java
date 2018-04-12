package lecture_15;

public class Node<T> {
	
	public T data;
	public Node<T> next;
	
	public Node(T data){
		this.data=data;
		next=null;
	}

}
