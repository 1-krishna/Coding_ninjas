package L17;

public class StackUse {

	public static void main(String[] args) {
		StackUsingArray s = new StackUsingArray(5);
		System.out.println(s.getSize());
		try {
			s.push(10);
			s.push(20);
			s.push(30);
			s.push(40);
			s.push(50);
			s.push(60);
		} catch (StackFull e) {
			System.out.println("Stack Full !");
		}
		System.out.println("Size : " + s.getSize());
		try {
			System.out.println("Top : " + s.top());
			System.out.println("Pop : " + s.pop());
		} catch (StackEmpty e) {
			System.out.println("Stack empty !");
		}
		
		
	}
}
