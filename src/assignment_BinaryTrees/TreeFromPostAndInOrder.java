package assignment_BinaryTrees;

import java.util.Scanner;

import L19.BinaryTreeNode;
import L19.BinaryTreeUse;

public class TreeFromPostAndInOrder {

	public static BinaryTreeNode<Integer> getTree(int[] post,int[] in,int pstart,int pend,int istart,int iend){
		if(istart>iend){
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(post[pstart]);
		int i ;
		int y = 0;
		for(i = istart ; i <= iend ; i++){

			if(in[i]==root.data){
				break;
			}
			y++;

		}
		y=pstart+y;
		int x = i;



		BinaryTreeNode<Integer> leftSub = getTree(post,in,pstart-1,pstart-1-y,istart,x-1);
		BinaryTreeNode<Integer> rightSub = getTree(post,in,y-1,pend,x+1,iend);

		root.left = leftSub;
		root.right = rightSub;

		return root;
	}  

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int size = s.nextInt();
		int post[] = new int[size];
		int in[] = new int[size];
		for(int i=0;i<size;i++){
			post[i]=s.nextInt();
		}
		for(int j=0;j<size;j++){
			in[j]=s.nextInt();
		}

		BinaryTreeNode<Integer> root = getTree(post,in,post.length-1,0,0,in.length-1);
		BinaryTreeUse.print(root);
	}

}
