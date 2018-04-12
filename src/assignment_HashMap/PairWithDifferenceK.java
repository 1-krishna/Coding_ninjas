package assignment_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class PairWithDifferenceK {

	public static void findPairsDifferenceK(int[] input, int k){
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

		for(int key : input){
			if(m.containsKey(key)){
				int freq = m.get(key);
				m.put(key, freq+1);
			}
			else{
				m.put(key, 1);
			}
		}

		for(int key : input){//k=1,key=9,ans=10,8
			if(m.containsKey(key)){
				if(m.get(key)>0){
					boolean flag=false;
					if(m.containsKey(key-k)){
						if(m.get(key-k)>0){
							for(int i=0;i<m.get(key-k);i++){
								System.out.println(Math.min(key-k, key)+" "+Math.max(key-k, key));
							}
							flag=true;
						}

					}
					if(m.containsKey(key+k) && k+key!=key-k){
						if(m.get(key+k)>0){
							for(int i=0;i<m.get(key+k);i++){
								System.out.println(Math.min(key+k, key)+" "+Math.max(key+k, key));
							}
							flag=true;
						}
					}
					
						m.remove(key);
					
				}
			}
		}


	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++){
			input[i] = s.nextInt();
		}
		int k = s.nextInt();
		findPairsDifferenceK(input, k);
		s.close();

	}

}
