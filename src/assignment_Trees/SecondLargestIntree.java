package assignment_Trees;

import L18.TreeNode;
import L18.TreeUse;

public class SecondLargestIntree {
	
	
	public static Pair sec(TreeNode<Integer> root){
		Pair ans = new Pair(root, null);
		
		for(int i = 0 ;i < root.children.size();i++){
			TreeNode<Integer> child = root.children.get(i);
			
			Pair temp = sec(child);
			
			if(ans.largest.data<temp.largest.data){
				TreeNode<Integer> tempr = ans.largest;
				ans.largest=temp.largest;
				if(ans.secondLargest==null){
					ans.secondLargest= tempr;
				}
				else{
					if(tempr.data>temp.secondLargest.data){
						ans.secondLargest=tempr;
					}
					else{
						ans.secondLargest=temp.secondLargest;
					}
				}
			}
		}
		
		if(ans.largest.data>root.data){
			return ans;
		}
		else{
			TreeNode<Integer> tempr = ans.secondLargest;
			if(ans.secondLargest==null){
				ans.secondLargest= root;
			}
			else{
				if(tempr.data>temp.secondLargest.data){
					ans.secondLargest=tempr;
				}
				else{
					ans.secondLargest=temp.secondLargest;
				}
			}
			
		}
		
	}

	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


		// Write your code here
		
		int ans = 0;
		TreeNode<Integer> ret=null,ret2=null;
		
		for(int i=0;i<root.children.size();i++){
		    TreeNode<Integer> child = root.children.get(i);
		    TreeNode<Integer> Childdata = findSecondLargest(child);
		    if(ans<Childdata.data){
		        ret2=ret;
		        ans=Childdata.data;
		        ret=Childdata;
		    }
		}
		if(ans<root.data){
			if(ret!=null){
		    return ret;
			}
			else{
				return ret2;
			}
		}
		else{
		    return ret2;
		}

	}
	
	public static void main(String[] args) {
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		TreeNode<Integer> ans = findSecondLargest(root);
		System.out.println(ans.data);
	}
}
