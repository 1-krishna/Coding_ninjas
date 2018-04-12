package lecture_24;

public class DPNoOfBalBT_Recursive {

	public static int noOfBalancedBT(int height,int[] input){
		if(height<=1){
			return input[height];
		}
		if(input[height-1]==0){
			input[height-1] = noOfBalancedBT(height-1, input);
		}
		if(input[height-2]==0){
			input[height-2] = noOfBalancedBT(height-2, input);
		}
		input[height] = (input[height-1] * input[height-1]) + 2 * input[height-1] * input[height-2];
		return input[height];
	}

	public static void main(String[] args) {
		int height = 5;

		int input[] = new int[height+1];

		input[0] = 1;
		input[1] = 1;

		System.out.println(noOfBalancedBT(height, input));

	}

}
