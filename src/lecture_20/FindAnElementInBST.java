package lecture_20;
import L19.BinaryTreeUse;
import L19.BinaryTreeNode;

public class FindAnElementInBST {
	public static boolean findElement(BinaryTreeNode<Integer> root, int x){
		if(root==null){
			return false;
		}
		if(root.data==x){
			return true;
		}
		boolean ans= false;
		if(x<root.data){
			ans =findElement(root.left, x);
		}
		else{
			ans = findElement(root.right, x);
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		System.out.println(findElement(root, 7));
	}
}
