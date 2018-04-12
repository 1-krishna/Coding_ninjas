package assignment_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ExtractUniqueCharacters {
	
	public static String uniqueChar(String str){
		HashMap<Character, Boolean> m = new HashMap<Character,Boolean>();
		for(int i=0;i<str.length();i++){
			char key = str.charAt(i);
			if(!m.containsKey(key)){
				m.put(key, true);
			}
		}
		String ans="";
		for(int i=0;i<str.length();i++){
			char key = str.charAt(i);
			if(m.get(key)){
				ans+=key;
				m.put(key, false);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(uniqueChar(str));
		s.close();
	}
}
