package L17;

import java.util.Scanner;

import lecture_15.Node;

class Pair {
	public Node<Integer> head;
	public Node<Integer> tail;
}

public class LL {

	public static Pair reverseLLRec(Node<Integer> head) {
		if(head == null || head.next == null) {
			Pair ans = new Pair();
			ans.head = head;
			ans.tail = head;
			return ans;
		}

		Pair smallAns = reverseLLRec(head.next);
		smallAns.tail.next = head;
		head.next = null;

		Pair ans = new Pair();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;
	}

	public static Node<Integer> reverseLL(Node<Integer> head) {
		return reverseLLRec(head).head;
	}



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		try {
			fun_A(a, b);
		} catch (DivideByZero e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("b cannot be 0");
			System.out.println("Please enter again !");
		}

	}

	public static void fun_A(int a, int b) throws DivideByZero {
		fun_B(a, b);
	}

	public static void fun_B(int a, int b) throws DivideByZero {
		fun_C(a, b);
	}

	public static void fun_C(int a, int b) throws DivideByZero {
		if(b == 0) {
			DivideByZero d = new DivideByZero();
			throw d;
		}
		else {
			int c = a/b;
			System.out.println(c);
		}
	}










}
