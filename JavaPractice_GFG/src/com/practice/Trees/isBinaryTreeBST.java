package com.practice.Trees;

public class isBinaryTreeBST {
	/* Class containing left and right child of current node and key value*/
	static class TreeNode{
		int val;
		TreeNode left,right;
		TreeNode(int val)
		{
			this.val=val;
			left=null;
			right=null;
		}
	}
	static TreeNode root;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		isBinaryTreeBST tree = new isBinaryTreeBST(); 
	        tree.root = new TreeNode(4); 
	        tree.root.left = new TreeNode(2); 
	        tree.root.right = new TreeNode(5); 
	        tree.root.left.left = new TreeNode(1); 
	        tree.root.left.right = new TreeNode(3); 
	  
	        if (tree.isBST(root)) 
	            System.out.println("IS BST"); 
	        else
	            System.out.println("Not a BST"); 

	}

	  boolean isBST()  { 
	        return isBSTUtil(root, Integer.MIN_VALUE, 
	                               Integer.MAX_VALUE); 
	    }

	  /*
	   * Time Complexity: O(n)
Auxiliary Space : O(1) if Function Call Stack size is not considered, otherwise O(n)
	   */
	private boolean isBSTUtil(TreeNode node, int minValue, int maxValue) {
		/* An empty tree is BST*/
		if(node==null)
			return true;
		
		/* false if this node violates the min/max constraints */
		if(node.val<minValue || node.val > maxValue)
		{
			return false;
		}
		/* check the subtrees recursively tightening the min/max constraints */	
		//allow only distinct value in tree	so max value is node.val-1
		return ((isBSTUtil(node.left,minValue,node.val-1))&&(isBSTUtil(node.right,node.val+1,maxValue)));
	} 
	 
	/*Using In-Order Traversal
	 * 1) Do In-Order Traversal of the given tree . (UPDATE: (insted of storing use just prev element)Store in temp array , it will have data in ascending sorted order for BST)
	 * 2) we can keep track of previously visited node.
	 *    If the value of the currently visited node is less than the previous value, then tree is not BST. 
	 */
	  /*
	   * Time Complexity: O(n)
	   * Auxiliary Space : O(1) 
	   */
	TreeNode prev;
	 boolean isBST(TreeNode node)  { 
	      
		 if(node!=null)
		 {
			 // traverse the tree in inorder fashion and keep a track of previous node 
			  if (!isBST(node.left)) 
	                return false; 
			  
			// allows only distinct values node so <=
			 if(prev!=null && node.val <= prev.val)
			 {
				 //Data not sorted thus not BST
				 return false;
			 }
			 prev=node;
			 return isBST(node.right);
		 }
		 return true;
	 }
}
