package Lecture_1;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		int fibo=0;
		int i=1;
		int prev=0;
		int next=1;
		int c;
		
		//Print Nth term of a fibonacci series
		
		if(n==1){
			System.out.println(prev);
		}
		else if(n==2){
			System.out.print(prev+" "+next+" ");
		}
		else{
			while(i<=n-2){
				c=next;
				next=prev+next;
				prev=c;
				i++;
			}
			System.out.print(next+" ");
		}
		
		// Print fibonacci series
		/*System.out.print(prev+" "+next+" ");
		while(i<=n-2){
			c=next;
			next=prev+next;
			prev=c;
			System.out.print(next+" ");
			i++;
		}*/
	}

}
