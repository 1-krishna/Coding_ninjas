package assignment_StacksAndQueues;

import L17.QueueUsingLinkList;

public class ReverseQueue {
	
	public static void reverseQueue(QueueUsingLinkList<Integer> q) {
		if(q.isEmpty()){
			return;
		}
		int a=q.dequeue();
		reverseQueue(q);
		q.enqueue(a);
		
	}

	public static void main(String[] args) {
		QueueUsingLinkList<Integer> a = new QueueUsingLinkList<Integer>();
		
		a.enqueue(12);
		a.enqueue(13);
		a.enqueue(14);
		a.enqueue(15);
		reverseQueue(a);
		while(!(a.isEmpty())){
			System.out.println(a.dequeue());
		}
	}

	

}
