package assignment_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import L2.TakeInput;



public class LongestConsecutiveSubsequence {
	static ArrayList<Integer> head = new ArrayList<Integer>();
	static int maxCount = Integer.MIN_VALUE;

	public static ArrayList<Integer> helper(HashMap<Integer, Boolean> m){
		int count = 0;
		
		for(int keyValue : m.keySet()){
			count = 0;
			ArrayList<Integer> current = new ArrayList<Integer>();
			int key = keyValue;
			current.add(key);
			while(m.containsKey(key+1)){
				current.add(key+1);
				count++;
				key++;
			}
			if(count>maxCount){
				head = current;
				maxCount = count;
			}
		}
		return head;
	}


	public static ArrayList<Integer> longestSubsequence(int[] arr){
		HashMap<Integer, Boolean> m = new HashMap<Integer, Boolean>();
		head.add(arr[0]);
		maxCount = 1;
		for(int element : arr){
			m.put(element, true);
		}
		return helper(m);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}
		
		System.out.println(longestSubsequence(arr));
	}

}
