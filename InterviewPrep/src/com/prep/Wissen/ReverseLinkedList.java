package com.prep.Wissen;

class ReverseLinkedList {
    
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	static Node head;
	
	//PRINT THE CONTENTS OF DOUBLE LINKEDLIST
	public void printList(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data);
			node=node.next;
			if(node!=null)
				System.out.print(" -> ");
		}
	}
	
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head= new Node(85);
		list.head.next = new Node(15); 
	    list.head.next.next = new Node(4); 
	    list.head.next.next.next = new Node(20);
	    
	    System.out.println("Input List:");
	    list.printList(head);
	    
	   head= list.reverseList(head);
	   System.out.println("\nOutput List:");
	    list.printList(head);

	}
	
	public Node reverseList(Node node)
	{
		Node current=node;
		Node prev = null,next=null;
		while(current!=null)
		{
			next = current.next;
			current.next= prev;
			prev=current;
			current=next;
		}
		node=prev;
		return node;
	}

}
