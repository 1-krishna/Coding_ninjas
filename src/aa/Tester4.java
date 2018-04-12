package aa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

import lecture_15.Node;

public class Tester4 {

	public static void changeLL(Node<Integer> head) {
		int count = Integer.MIN_VALUE;
		Node<Integer> temp = head;

		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

		while(head.data!=-1){
			int i=head.data;
			if(m.containsKey(i)){
				int freq = m.get(i);
				m.put(i, freq+1);
			}
			else{
				m.put(i, 1);
			}
			if(head.data>count){
				count=head.data;
			}
			head=head.next;
		}

		head=temp;

		while(head.data!=-1){
			if(m.get(head.data)>1){
				head.data=count+1;
				count+=1;
			}
		}



	}
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream(new File("e:/hellyeah.txt")));
		System.setOut(new PrintStream(new File("e:/hellno.txt")));
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		System.out.println(n);
		
	}


}
