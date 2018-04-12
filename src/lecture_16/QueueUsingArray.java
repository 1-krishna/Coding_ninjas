package lecture_16;

public class QueueUsingArray {
	private int data[];
	private int size;
	private int frontIndex;
	private int nextIndex;
	
	public QueueUsingArray(int size) {
		data = new int[size];
		size=0;
		frontIndex=-1;
		nextIndex=0;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public int dequeue(){
		return 0;
	}
	
}
