package lecture_22;

import java.util.HashMap;
import java.util.Scanner;

public class PrintArrayIntersection {


	public static void intersection(int[] arr1, int[] arr2){

		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

		for(int i : arr1){
			if(m.containsKey(i)){
				int freq = m.get(i);
				m.put(i, freq+1);
			}
			else{
				m.put(i, 1);
			}
		}

		for(int i : arr2){
			if(m.containsKey(i)){
				if(m.get(i)>0){
					System.out.println(i);
					int freq = m.get(i);
					m.put(i, freq-1);
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr1[] = new int[n];
		for(int i = 0 ; i < n ; i ++){
			arr1[i] = s.nextInt();
		}
		n=s.nextInt();
		int arr2[] = new int[n];
		for(int i = 0 ; i < n ; i ++){
			arr2[i] = s.nextInt();
		}

		intersection(arr1, arr2);
	}

}
