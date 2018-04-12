package aaa;

import java.util.Scanner;

public class NextLargerElementInTree {

	static int result=Integer.MIN_VALUE;

	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		int ans = 0;
		TreeNode<Integer> ret=root;

		if(root==null){
			return null;
		}

		for(int i=0;i<root.children.size();i++){
			TreeNode<Integer> child = root.children.get(i);
			TreeNode<Integer> dataChild = findNextLargerNode(child,n);
			if(dataChild!=null){
				if(result==Integer.MIN_VALUE && n<dataChild.data){
					result=dataChild.data;
					ret=dataChild;
				}
				else if(result!=Integer.MIN_VALUE && n<dataChild.data && result>dataChild.data){
					result=dataChild.data;
					ret=dataChild;
				}
			}
		}
		if(result>root.data && root.data>n ){
			return root;
		}
		else{
			return ret;
		}
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int  n = s.nextInt();
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();

		System.out.println(findNextLargerNode(root, n).data);
	}


}
