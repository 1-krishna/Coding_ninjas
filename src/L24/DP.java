package L24;

import java.util.Scanner;

public class DP {

	// ans - m * n
	// i = 0 and j = 0
	public static int minCost(int input[][], int ans[][], int i, int j) {
		if(i == input.length || j == input[0].length) {
			return Integer.MAX_VALUE;
		}
		int x = Integer.MAX_VALUE, y = Integer.MAX_VALUE, z = Integer.MAX_VALUE;
		if(j + 1 < input[0].length && ans[i][j + 1] == 0) {
			ans[i][j + 1] = minCost(input, ans, i, j + 1);
			x = ans[i][j + 1];
		}
		if(i + 1 < input.length && ans[i + 1][j] == 0) {
			ans[i + 1][j] = minCost(input, ans, i+1, j);
			y = ans[i + 1][j];
		}
		if(i + 1 < input.length && j + 1 < input[0].length && 
				ans[i+1][j+1] == 0) {
			ans[i+1][j+1] = minCost(input, ans, i + 1, j + 1);
			z = ans[i+1][j+1];
		}
		
		ans[i][j] = Math.min(x, Math.min(y, z)) + input[i][j];
		return ans[i][j]; 
	}
	
	
	public static int lcs(String s, String t) {
		if(s.length() == 0 || t.length() == 0) {
			return 0;
		}
		if(s.charAt(0) == t.charAt(0)) {
			return 1 + lcs(s.substring(1), t.substring(1));
		}
		else {
			int a = lcs(s, t.substring(1));
			int b = lcs(s.substring(1), t);
			return Math.max(a, b);
		}
	}
	
	// ans is initialized with -1
	public static int lcs_RecDP(String s, String t, int ans[][]) {
		if(s.length() == 0 || t.length() == 0) {
			return 0;
		}
		int m = s.length();
		int n = t.length();
		if(s.charAt(0) == t.charAt(0)) {
			if(ans[m-1][n-1] == -1) {
				ans[m-1][n-1] = lcs_RecDP(s.substring(1), t.substring(1), ans);
			}
			ans[m][n] = 1 + ans[m-1][n-1];
		}
		else {
			if(ans[m][n-1] == -1) {
				ans[m][n-1] = lcs_RecDP(s, t.substring(1), ans);
			}
			if(ans[m-1][n] == -1) {
				ans[m-1][n] = lcs_RecDP(s.substring(1), t, ans);
			}
			ans[m][n] = Math.max(ans[m][n-1], ans[m-1][n]);
		}
		return ans[m][n];
	}
	
	public static int minSteps(int n) {
		if(n <= 1) {
			return 0;
		}
		int x = minSteps(n - 1);
		int y = Integer.MAX_VALUE, z = Integer.MAX_VALUE;
		if(n % 2 == 0) {
			y = minSteps(n / 2);
		}
		if(n % 3 == 0) {
			z = minSteps(n / 3);
		}
		return Math.min(x, Math.min(y, z)) + 1;
	}
	
	public static int minSteps(int n, int ans[]) {
		if(n <= 1) {
			return 0;
		}
		int x;
		if(ans[n-1] == 0) {
			x = minSteps(n - 1);
			ans[n - 1] = x;
		}
		else {
			x = ans[n - 1];
		}
		int y = Integer.MAX_VALUE, z = Integer.MAX_VALUE;
		if(n % 2 == 0) {
			if(ans[n/2] == 0) {
				y = minSteps(n / 2);
				ans[n/2] = y;
			}
			else {
				y = ans[n/2];
			}
		}
		if(n % 3 == 0) {
			if(ans[n/3] == 0) {
				z = minSteps(n / 3);
				ans[n/3] = z;
			}
			else {
				z = ans[n/3];
			}
		}
//		return Math.min(ans[n-1], Math.min(ans[n/2], ans[n/3]));
		return Math.min(x, Math.min(y, z)) + 1;
	}
	
	public static int minSteps_Iter(int n) {
		int ans[] = new int[n+1];
		ans[0] = 0;
		ans[1] = 0;
		for(int i = 2; i <= n; i++) {
			int x = ans[i - 1];
			int y = Integer.MAX_VALUE, z = Integer.MAX_VALUE;
			if(i % 2 == 0) {
				y = ans[i/2];
			}
			if(i % 3 == 0) {
				z = ans[i / 3];
			}
			ans[i] = Math.min(x, Math.min(y, z)) + 1;
		}
		return ans[n];
	}
	
	public static int numberOfBalancedBTs(int h) {
		if(h <= 1) {
			return 1;
		}
		int x = numberOfBalancedBTs(h - 1);
		int y = numberOfBalancedBTs(h - 2);
		return (x*x) + 2 * x * y;
	}
	
	public static int fibonacci(int n, int ans[]) {
		if(n <= 1) {
			return n;
		}
		if(ans[n-1] == 0) {
			ans[n - 1] = fibonacci(n - 1, ans);
		}
		if(ans[n - 2] == 0) {
			ans[n - 2] = fibonacci(n - 2, ans);
		}
		ans[n] = ans[n - 1] + ans[n - 2];
		return ans[n];
	}
	
	public static int fibonacci_Iter(int n) {
		int ans[] = new int[n + 1];
		ans[0] = 0;
		ans[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			ans[i] = ans[i - 1] + ans[i - 2];
		}
		return ans[n];
	}
	
	public static int fibonacci(int n) {
		int ans[] = new int[n + 1];
		return fibonacci(n, ans);
	}
	
	public static int[][] take2d(){
		
		/*4
		4
		1 1 2 3
		4 0 6 7
		8 9 6 11
		12 13 14 0*/
		
		System.out.println("enter no. of rows and columns");
		Scanner s = new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int input[][] = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static int[][] fillwithminus1(int[][] input){
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input[0].length;j++){
				input[i][j] = -1;
			}
		}
		return input;
	}
	
	
	public static void main(String[] args) {
		/*int input[][] = take2d();
		int ans[][] = new int[input.length][input[0].length];
		System.out.println(minCost(input, ans, 0, 0));*/
		
		String s = "abcdef";
		String t = "xadgbe";
		int ans[][] = new int[s.length()+1][t.length()+1];
		ans = fillwithminus1(ans);
		System.out.println(lcs_RecDP(s, t, ans));
		for(int i=0;i<ans.length;i++){
			for(int j=0;j<ans[0].length;j++){
				System.out.print(ans[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
