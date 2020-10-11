package com.practice.Trees;

public class MirrorTree {

	/**
	 * Given a Binary Tree, convert it into its mirror.
	 */
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data = d;
			left=null;
			right=null;
		}
	}
	
	static void inorder(Node node)
	{
		if(node!=null)
		{
			inorder(node.left);
			System.out.print(node.data+" ");
			inorder(node.right);
		}
	}
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(6);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		
		System.out.print("Inorder Traversal:");
		inorder(root);
		Node mirrorRoot = null;
		mirrorRoot = createMirrorTree(root);
		System.out.print("\nInorder Traversal Mirror Tree:");
		inorder(mirrorRoot);
				
	}
	//It recurses on both the trees,  
	// but when original tree recurses on left,  
	// mirror tree recurses on right and  
	// vice-versa  
	private static Node createMirrorTree(Node oldRoot) {
		Node mirrorRoot=null;
		if(oldRoot!=null)
		{
			 // Create new mirror root node from original tree node  
			mirrorRoot=new Node(oldRoot.data);
			mirrorRoot.left = createMirrorTree(oldRoot.right);
			mirrorRoot.right = createMirrorTree(oldRoot.left);
			
		}
		return mirrorRoot;
	}

}
