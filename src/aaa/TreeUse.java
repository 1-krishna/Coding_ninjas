package aaa;

import java.util.Scanner;

import L17.QueueUsingLinkList;
import aaa.TreeNode;



public class TreeUse {



	public static void print(TreeNode<Integer> root){
		System.out.print(root.data+":");
		for(int i = 0;i<root.children.size();i++){

			System.out.print(root.children.get(i).data+",");
		}
		System.out.println();

		for(int i=0;i<root.children.size();i++){
			print(root.children.get(i));
		}
	}

	public static void printLevelWise(TreeNode<Integer> root){
		System.out.println(root.data);
		QueueUsingLinkList<TreeNode<Integer>> q = new 
				QueueUsingLinkList<TreeNode<Integer>>();
		for(int i=0;i<root.children.size();i++){
			TreeNode<Integer> child = root.children.get(i);
			q.enqueue(child);
//			System.out.print(child.data+" ");
			
		}
		q.enqueue(null);

		while(!q.isEmpty()){
			TreeNode<Integer> current = q.dequeue();
			if(current==null && q.isEmpty()){
				break;
			}
			if(current==null){
				System.out.println();
				q.enqueue(null);
			}
			else{
				System.out.print(current.data+ " ");
				for(int i = 0 ; i < current.children.size() ; i++){
					TreeNode<Integer> child = current.children.get(i);
					q.enqueue(child);
				}
			}

		}
	}


	//1 3 2 3 4 2 5 6 0 1 7 0 0 1 8 0


	public static TreeNode<Integer> takeInputLevelWise(){

		Scanner s = new Scanner(System.in);

		System.out.println("Enter root data");

		int rootData = s.nextInt();

		TreeNode<Integer> root = new TreeNode<Integer>(rootData);

		QueueUsingLinkList<TreeNode<Integer>> q = new QueueUsingLinkList<TreeNode<Integer>>();

		q.enqueue(root);

		while(!q.isEmpty()){
			TreeNode<Integer> current = q.dequeue();
			System.out.println("Enter number of childrens for : "+current.data);

			int n= s.nextInt();
			if(n>0){
				System.out.println("Enter childrens seperated by space");
			}
			for(int i =0 ;i<n;i++){
				int  childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				q.enqueue(child);
				current.children.add(child);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
		System.out.println("");
		print(root);
	}
}
