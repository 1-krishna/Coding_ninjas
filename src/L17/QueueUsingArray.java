package L17;

public class QueueUsingArray {
	private int data[];
	int nextIndex;
	int frontIndex;
	int size;
	
	QueueUsingArray(int s) {
		data = new int[s];
		nextIndex = 0;
		frontIndex = -1;
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int front() {
		if(isEmpty()) {
			// TODO - throw exception
		}
		return data[frontIndex];
	}
	
	public void enqueue(int element) {
		if(size == data.length) {
			// TODO - Queue full exception
		}
		data[nextIndex] = element;
		nextIndex = (nextIndex + 1) % data.length;
		size++;
		if(frontIndex == -1) {
			frontIndex = 0;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			// TODO - throw exception
		}
		int ans = data[frontIndex];
		frontIndex = (frontIndex + 1) % data.length;
		size--;
		if(size == 0) {
			nextIndex = 0;
			frontIndex = -1;
		}
		return ans;
	}
	
}
