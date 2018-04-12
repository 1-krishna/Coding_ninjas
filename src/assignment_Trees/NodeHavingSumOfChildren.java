package assignment_Trees;

import aaa.TreeNode;
import aaa.TreeUse;

public class NodeHavingSumOfChildren {

	/*public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
 		TreeNode<Integer> ans = null;
		int sum=0;


		for(int i =0 ;i<root.children.size();i++){
		    TreeNode<Integer> child = root.children.get(i);
//		    sum+=child.data;
		    ans = maxSumNode(child);


		}
		if(ans!=null){
		System.out.println("ans     "+ans.data);
		}
		if(root.data!=null){
		sum+=root.data;
		}
		sum+=root.data;
		for(int i=0;i<root.children.size();i++){
			sum+=root.children.get(i).data;
		}
		System.out.println("Sum     "+sum);
		int sumTemp=0;
		if(ans!=null){
		for(int i = 0 ;i<ans.children.size();i++){
		    TreeNode<Integer> current = ans.children.get(i);
		    sumTemp+=current.data;
		}

		sumTemp+=ans.data;
		}
		System.out.println("SumTemp  "+sumTemp);
		if(sumTemp<sum){
		    return root;
		}
		else{
		    return ans;
		}
	}
	 */	



	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here

		TreeNode<Integer> ans =  null;


		

		for(int i =0 ;i<root.children.size();i++){
			TreeNode<Integer> child = root.children.get(i);
			TreeNode<Integer> temp = maxSumNode(child);
			ans = temp;
		}

		int sumRoot=root.data;

		for(int i = 0 ;i<root.children.size();i++){
			TreeNode<Integer> current = root.children.get(i);
			sumRoot+=current.data;
		}



		int sumAns = 0;

		sumAns+=ans.data;
		for(int i=0;i<ans.children.size();i++){
			TreeNode<Integer> current = ans.children.get(i);
			sumAns+=current.data;
		}



		if(sumAns<=sumRoot){
			return root;
		}
		else{
			return ans;
		}
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		TreeUse.printLevelWise(root);
		System.out.println();
		TreeUse.print(root);
		TreeNode<Integer> ans = maxSumNode(root);
		System.out.println(ans.data);
		
	}

}
