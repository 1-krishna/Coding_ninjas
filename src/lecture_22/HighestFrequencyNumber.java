package lecture_22;

import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequencyNumber {
	
	public static int maxFrequencyNumber(int[] input){
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i : input){
			if(m.containsKey(i)){
				int freq = m.get(i);
				m.put(i, freq+1);
			}
			else{
				m.put(i, 1);
			}
		}
		
		int maxFreq = Integer.MIN_VALUE;
		int keyMax=0;
		for(int i : input){
			int freq = m.get(i);
			if(freq > maxFreq){
				maxFreq = freq;
				keyMax = i;
			}
		}
		return keyMax;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0 ; i < n ; i ++){
			input[i] = s.nextInt();
		}
		System.out.println(maxFrequencyNumber(input));
	}

}
