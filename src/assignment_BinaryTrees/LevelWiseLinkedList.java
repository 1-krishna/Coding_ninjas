package assignment_BinaryTrees;

import java.util.ArrayList;

import L17.QueueUsingLinkList;
import L19.BinaryTreeNode;
import L19.BinaryTreeUse;
import lecture_15.Node;

public class LevelWiseLinkedList {

	static ArrayList<Node<BinaryTreeNode<Integer>>> ans = 
			new ArrayList<Node<BinaryTreeNode<Integer>>>();
	static QueueUsingLinkList<BinaryTreeNode<Integer>> q =
			new QueueUsingLinkList<BinaryTreeNode<Integer>>(); 

	public static ArrayList<Node<BinaryTreeNode<Integer>>> 
	LLForEachLevel(BinaryTreeNode<Integer> root){

		Node<BinaryTreeNode<Integer>> a = new  Node<BinaryTreeNode<Integer>>(root);
		ans.add(a);
		if(root.left!=null){
			q.enqueue(root.left);
		}
		if(root.right!=null){
			q.enqueue(root.right);
		}
		q.enqueue(null);
		
		Node<BinaryTreeNode<Integer>> head = null;
		Node<BinaryTreeNode<Integer>> prev = null;
		
		while(!q.isEmpty()){
			BinaryTreeNode<Integer> current = q.dequeue();
			Node<BinaryTreeNode<Integer>> no = new Node<BinaryTreeNode<Integer>>(current);

			if(current==null && q.isEmpty()){
				Node<BinaryTreeNode<Integer>> copy = head;
				ans.add(copy);
				break;
			}
			if(current==null){
				Node<BinaryTreeNode<Integer>> copy = head;
				ans.add(copy);
				head = null;
				prev = null;
				q.enqueue(null);
			}
			else{
				//System.out.print(current.data+ " ");
				
				if(head==null){
					head = no;
					prev = no;
				}
				else{
					prev.next = no;
					prev = prev.next;
				}
				
				if(current.left!=null){
					q.enqueue(current.left);
				}
				if(current.right!=null){
					q.enqueue(current.right);
				}
			}

		}
		
		return ans;


	}


	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();

		System.out.println(LLForEachLevel(root));


	}

}
