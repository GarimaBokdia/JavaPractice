package com.prep.Wissen;

public class DeletedNodeInLLReference {

	private class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	Node head;//Head of the list
	
	void printList()
	{
		Node node=head;
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}

	void push(int d)
	{
		/* 1. alloc the Node and put the data */
		Node n = new Node(d);
		/* 2. Make next of new Node as head */
		n.next = head;
	     /* 3. Move the head to point to new Node */
		head=n;
	}
	
	void deleteNode(Node refNode)
	{
		Node temp = refNode.next;
		refNode.data=temp.data;
		refNode.next = temp.next;
		temp=null;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DeletedNodeInLLReference llist = new DeletedNodeInLLReference(); 
  
        /* Use push() to construct below list 
        6 4 8 12 9  */
        llist.push(6); 
        llist.push(4); 
        llist.push(8); 
        llist.push(12); 
        llist.push(9); 
  
        System.out.println("Before deleting"); 
        llist.printList(); 
  
        /* I m deleting the head itself. 
        You can check for more cases */
        llist.deleteNode(llist.head.next.next); 
  
        System.out.println("\nAfter Deleting"); 
        llist.printList(); 

	}

}
