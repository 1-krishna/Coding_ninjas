package L20;

import L18.TreeNode;

class Pair {
	TreeNode<Integer> max;
	TreeNode<Integer> smax;
	Pair(TreeNode<Integer> m, TreeNode<Integer> sm) {
		max = m;
		smax = sm;
	}
}

public class TreeUse {

	public static Pair secondLargest(TreeNode<Integer> root) {
		if(root == null) {
			Pair ans = new Pair(root, root);
			return ans;
		}
		Pair ans = new Pair(root, null);
		
		/*for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
		}*/
		
		for(TreeNode<Integer> child : root.children) {
			Pair childAns = secondLargest(child);
			
			TreeNode<Integer> finalMax, finalSMax;
			if(childAns.max.data > ans.max.data) {
				finalMax = childAns.max;
				if(childAns.smax == null) {
					finalSMax = ans.max;
				}
				else {
					if(ans.max.data > childAns.smax.data) {
						finalSMax = ans.max;
					}
					else {
						finalSMax = childAns.smax;
					}
				}
			}
			else {
				finalMax = ans.max;
				if(ans.smax == null) {
					finalSMax = childAns.max;
				}
				else {
					if(ans.smax.data > childAns.max.data) {
						finalSMax = ans.smax;
					}
					else {
						finalSMax = childAns.max;
					}
				}
			}
			
			ans.max = finalMax;
			ans.smax = finalSMax;
		}
		return ans;
		
	}
	
	public static void postOrder(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		for(TreeNode<Integer> child : root.children) {
			postOrder(child);
		}
		System.out.println(root.data);
	}
	
	public static void main(String[] args) {
		double a[] = {3, 6, 8, 9, 20};
		for(double j : a) {
			System.out.println(j);
		}
	}	
}
