package assignment_DP;

public class LongestIncreasingSubsequence {
	static int ans[] = {-1,-1,-1,-1,-1,-1,-1};

	public static int longestIncrSubs(int[] input,int start,int prevMin){
		if(start == input.length){
			return 0;
		}

		int x = Integer.MIN_VALUE;
		int y = Integer.MIN_VALUE;

		x = longestIncrSubs(input, start+1, prevMin);
		y = longestIncrSubs(input, start+1, input[start]);

		if(input[start]>prevMin && y>=x){
			return y+1;
		}
		else{
			return x;
		}
	}

	public static int longestIncrSubs_RecDp(int[] input, int start, int prevMin) {

		if(start == input.length){
			ans[start] = 0;
			return ans[start];
		}
		if(ans[start+1]==-1){
			int p = longestIncrSubs_RecDp(input, start+1, prevMin);
			//int q = Integer.MIN_VALUE;
            int q=-1;
			q = longestIncrSubs_RecDp(input, start+1, input[start]);

			ans[start+1] = Math.max(p, q);

		}
		if(input[start]>prevMin){
			ans[start] = ans[start+1] + 1;
		}
		else{
			ans[start] = ans[start+1];
		}

		return ans[start];


	}

	public static void main(String[] args) {

		int input[] = {1,4,3,2};


		System.out.println(longestIncrSubs(input,0,Integer.MIN_VALUE));
		System.out.println(longestIncrSubs_RecDp(input, 0, Integer.MIN_VALUE));

		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]+" ");
		}

	}

}
