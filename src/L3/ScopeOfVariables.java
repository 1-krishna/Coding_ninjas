package L3;

public class ScopeOfVariables {
	public static void main(String[] args) {
		int a = 10;
		
//		int a = 10;
		
		int b = 3;
		if(a < 20) {
			System.out.println(a);
			b = 10;
		}
		else {
			b = 100;
		}
		
		System.out.println(b);
		
		int i = 0;
		while(i < 5) {
			int j = 1;
			System.out.println(j);
			j = j + 10;
			i++;
		}
		
		
		int k;
		for(k = 0; k < 4; k++) {
			System.out.println(k);
		}
//		System.out.println(k);
		for(k = 9; k > 0; k--) {
			System.out.println(k);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
