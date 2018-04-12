package L9;

public class Recursion2 {

	public static void mergeSort(int input[]) {
		// 1. Base case
		
		// 2. Create two new arrays and copy the elements 
		// accordingly
		
		// 3. Call recursion on both halves
		
		// 4. Call mergeTwoSortedArrays on both sorted halves
	}

	public static String[] subsequences(String input) {
		if(input.length() == 0) {
			String ans[] = new String[1];
			ans[0] = "";
			return ans;
		}
		
		String smallAns[] = subsequences(input.substring(1));

		String output[] = new String[2 * smallAns.length];
		int j = 0;
		for(int i = 0; i < smallAns.length; i++, j++) {
			output[j] = smallAns[i];
		}
		for(int i = 0; i < smallAns.length; i++) {
			output[j] = input.charAt(0) + smallAns[i];
			j++;
		}
		return output;
	}

}
