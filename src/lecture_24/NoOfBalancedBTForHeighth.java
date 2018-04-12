package lecture_24;

public class NoOfBalancedBTForHeighth {
	
	public static int noOfBalancedBT(int height){
		if(height<=1){
			return 1;
		}
		int x = noOfBalancedBT(height-1);
		int y = noOfBalancedBT(height-2);
		return (x * x) + 2 * x * y;
	}

	public static void main(String[] args) {
		int height = 4;
		System.out.println(noOfBalancedBT(height));

	}

}
