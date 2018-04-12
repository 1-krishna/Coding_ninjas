package L2;
import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int numberToBePrinted = 1;
		while(numberToBePrinted <= n) {
			System.out.println(numberToBePrinted);
			numberToBePrinted = numberToBePrinted + 1;
		}
	}
}
