package lecture_22;

import java.util.HashMap;
import java.util.Scanner;

public class PairSumToZero {

	public static void PairSum(int[] input, int size){

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
		for(int i : input){
			if(m.containsKey(-i)){
				for(int j=0;j<m.get(-i)*m.get(i);j++){
					System.out.println(-Math.abs(i)+" "+Math.abs(i));
				}
				m.remove(i);
				m.remove(-i);
				
				/*if(m.get(i)>0 && m.get(-i)>0){
					System.out.println(-Math.abs(i)+" "+Math.abs(i));
					int freq = m.get(i);
					m.put(i, freq-1);
				}*/
			}
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0 ; i < n ; i ++){
			input[i] = s.nextInt();
		}

		PairSum(input, n);

	}

}
