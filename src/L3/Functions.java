package L3;

public class Functions {
	
	public static int sum(int a, int b) {
		int i = 0;
		while(i < 4) {
			if(i == 2) {
				return 1;
			}
			i++;
			return -1;
		}
		return 0;
		
		
		/*int i = 10;
		if(i < 5) {
			return 6;
		}
		else {
			return 6;
		}*/
	}
	
	public static int test(int a) {
		a = 100;
		int z = 100;
		return a;
	}
	
	public static void main(String[] args) {
		int a = 10, b = 19;
		
		a = test(a);
		
//		System.out.println(z);
		
		System.out.println(a);
	}
}
