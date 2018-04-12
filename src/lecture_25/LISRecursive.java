package lecture_25;

public class LISRecursive {

	static int ans[] = {-1,-1,-1,-1,-1,-1,-1,-1};

	public static int longestIncrSubs(int[] input,int start,int prevMin){
		if(start == input.length){
			return 0;
		}

		int x = Integer.MIN_VALUE;
		int y = Integer.MIN_VALUE;

		x = longestIncrSubs(input, start+1, prevMin);


		if(input[start]>prevMin){
			y = longestIncrSubs(input, start+1, input[start]);
		}

		return Math.max(x, y+1);
	}

	// We need to take 2d array of n^2 size for recursive DP solution
	public static int longestIncrSubs_DP(int[] input,int start,int prevMin){
		if(start==input.length){
			ans[start+1] = 0;
			return ans[start+1];
		}

		int x = Integer.MIN_VALUE;
		int y = Integer.MIN_VALUE;
		if(ans[start+1]==-1){
			x = longestIncrSubs(input, start+1, prevMin);
		}


		y = longestIncrSubs(input, start+1, input[start]);
		ans[start+1]=Math.max(x, y);

		if(input[start]>prevMin && ans[start+1]==-1){
			ans[start] = ans[start+1]+1;
		}
		else{
			ans[start] = ans[start+1];
		}
		return ans[start];


	}
	
	static int[] iterAns = {1,1,1,1,1,1,1,1,1};
	
	public static int longestIncrSubs_Iterative(int[] input){
		for(int i=0;i<input.length;i++){
			for(int j=0;j<i;j++){
				if(input[j]<input[i] && iterAns[j]+1>iterAns[i]){
					iterAns[i] = iterAns[j]+1;
				}
			}
		}
		int max = iterAns[0];
		for(int i=0;i<iterAns.length;i++){
			if(max<iterAns[i]){
				max = iterAns[i];
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {

		int input[] = {10,1,8,12,20,9,4};


//		System.out.println(longestIncrSubs_DP(input,0,Integer.MIN_VALUE));
		System.out.println(longestIncrSubs_Iterative(input));
		
		for(int i=0;i<iterAns.length;i++){
			System.out.print(iterAns[i]+" ");
		}

	}

}
