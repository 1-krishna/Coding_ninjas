package lecture_23;
import java.util.ArrayList;
import java.util.Scanner;

import L23.PriorityQueue;

public class KSortedArray {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		int input[] = new int[size];
		
		for(int i=0;i<size;i++){
			input[i] = s.nextInt();
		}
		
		int k = s.nextInt();
		int temp = k;
		
		int index = 0;
		
		while(k!=0){
			q.insert(input[index]);
			k--;
			index++;
		}
		k=temp;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		for(int i=index;i<size;i++){
			ans.add(q.removeMin());
			q.insert(input[i]);
		}
		
		while(k!=0){
			ans.add(q.removeMin());
			k--;
			
		}
		
		System.out.println(ans);

	}

}
