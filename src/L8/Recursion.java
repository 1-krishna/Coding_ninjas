package L8;

public class Recursion {

	public static int helper(int input[], int x, int startIndex) {
		// array is of size 0
		if(startIndex == input.length) {
			return -1;
		}
		int ans = helper(input, x, startIndex + 1);
		if(ans != -1) {
			return ans;
		}
		if(input[startIndex] == x) {
			return startIndex;
		}
		else {
			return -1;
		}
	}

	public static int checkNumber(int input[], int x) {
		return helper(input, x, 0);
	}

	public static boolean isSorted_1(int input[]) {
		// Special/Edge case
		if(input.length == 0) {
			return true;
		}

		// Base case
		if(input.length == 1) {
			return true;
		}

		// Small Calculation
		if(input[0] > input[1]) {
			return false;
		}

		// Recursive call
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++) {
			smallInput[i-1] = input[i];
		}
		boolean ans = isSorted_1(smallInput);
		return ans;
	}

	// startIndex = 0
	public static boolean isSorted_2(int input[], int startIndex) {
		// Special/Edge case
		if(startIndex == input.length) {
			return true;
		}

		// Base case
		if(startIndex == input.length - 1) {
			return true;
		}

		// Small Calculation
		if(input[startIndex] > input[startIndex + 1]) {
			return false;
		}

		// Recursive call
		boolean ans = isSorted_2(input, startIndex + 1);
		return ans;
	}

	public static boolean checkArray(int input[]) {
		return isSorted_2(input, 0);
	}

	// endIndex = input.length - 1
	public static boolean isSorted_3(int[] input, int endIndex) {
		// Special/Edge case
		if(endIndex == -1) {
			return true;
		}

		// Base case
		if(endIndex == 0) {
			return true;
		}

		if(input[endIndex - 1] > input[endIndex]) {
			return false;
		}
		boolean ans = isSorted_3(input, endIndex - 1);
		return ans;
	}

	public static void funA(int x) {
		x += 10;
	}

	public static int factorial(int n) {
		// Base case
		if(n <= 1) {
			return 1;
		}
		// Recursive call
		int x = factorial(n - 1);

		// Small calculation
		int ans = n * x;

		return ans;
	}

	public static void print(int n) {
		if(n <= 0) {
			return;
		}

		print(n - 1);

		System.out.println(n);
	}

	// start = 1
	public static void print_2(int n, int start) {
		if(start > n) {
			return;
		}
		// Small calculation
		System.out.println(start);

		// Recursive call
		print_2(n, start + 1);
	}

	public static int fibonacci(int n) {
		// Base case
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}

		// Recursive call
		int a = fibonacci(n - 1);
		int b = fibonacci(n - 2);

		// Small calculation
		return a + b;
	}

	public static void fun(int i) {
		fun(i);
	}

	public static void main(String[] args) {
//		fun(5);
		//		System.out.println(factorial(4));
		/*int x = 10;
		funA(x);
		System.out.println(x);*/
	}
}
