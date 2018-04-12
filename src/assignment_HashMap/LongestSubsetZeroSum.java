package assignment_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class LongestSubsetZeroSum {
	static int longest = Integer.MIN_VALUE;

	public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> input){
		HashMap<Integer, Integer> m = new HashMap<Integer,Integer>();

		for(int key : input){
			if(m.containsKey(key)){
				int freq = m.get(key);
				m.put(key, freq+1);
			}
			else{
				m.put(key, 1);
			}
		}


		return helper(m);


	}

	public static int helper(HashMap<Integer, Integer> m) {
		
		//Base Case
		
		//recursive call
		int temp = helper(m);
		//small calculation
		Set<Integer> s =  m.keySet();
		
		return 0;
	}

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			input.add(s.nextInt());
		}

		System.out.println(lengthOfLongestSubsetWithZeroSum(input));

	}

}
