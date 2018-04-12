package lecture_16;

import lecture_15.LinkedList;

public class User {

	public static void main(String[] args) {
		StackUsingLL<Integer> a = new StackUsingLL<Integer>();
		a.push(10);
		a.push(20);
		a.push(30);
		a.push(40);
		System.out.println(a.getSize());
		System.out.println(a.top());
		System.out.println(a.isEmpty());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.isEmpty());
		System.out.println(a.pop());
		/*LinkedList.printLL(a);*/

	}

}
