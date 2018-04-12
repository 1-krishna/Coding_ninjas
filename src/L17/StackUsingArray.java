package L17;

public class StackUsingArray {
	private int data[];
	private int nextIndex;
	
	public StackUsingArray(int s) {
		data = new int[s];
		nextIndex = 0;
	}
	
	public boolean isEmpty() {
		return nextIndex == 0;
	}
	
	public int getSize() {
		return nextIndex;
	}
	
	// Reads and return the topmost elmeent
	public int top() {
		if(isEmpty()) {
			StackEmpty e = new StackEmpty();
			try {
				throw e;
			} catch (StackEmpty e1) {
				System.out.println("Stack is empty !");
				return 0;
			}
		}
		return data[nextIndex - 1];
	}
	
	// Inserts an element 
	public void push(int element) throws StackFull {
		if(nextIndex == data.length) {
			StackFull e = new StackFull();
			throw e;
		}
		data[nextIndex] = element;
		nextIndex++;
	}
	
	// Deletes the topmost element
	public int pop() throws StackEmpty {
		if(isEmpty()) {
			StackEmpty e = new StackEmpty();
			throw e;
		}
		nextIndex--;
		return data[nextIndex];
	}
	
	
}
