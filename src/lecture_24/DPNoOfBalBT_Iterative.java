package lecture_24;

public class DPNoOfBalBT_Iterative {
	
	public static int noOfBalancedBT(int height, int[] input){
		input[0] = 1;
		input[1] = 1;
		for(int i=2;i<=height;i++){
			input[i] = (input[i-1] * input[i-1]) + 2 * input[i-1] * input[i-2];
		}
		return input[height];
	}

	public static void main(String[] args) {
		int height = 4;
		int input[] = new int[height+1];
		
		System.out.println(noOfBalancedBT(height, input));

	}

}
