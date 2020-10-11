package com.prep.GoldmanSachs;


public class ReverseLLFromTo {

	static class ListNode {
		     int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	static ListNode head;
	//PRINT THE CONTENTS OF DOUBLE LINKEDLIST
	public static void printList(ListNode node)
	{
		while(node!=null)
		{
			System.out.print(node.val);
			node=node.next;
			if(node!=null)
				System.out.print(" -> ");
		}
	}

	public static void main(String[] args) {
		ReverseLLFromTo list = new ReverseLLFromTo();
		list.head = new ListNode(1);
		list.head.next = new ListNode(2);
		list.head.next.next = new ListNode(3);
		list.head.next.next.next = new ListNode(4);
		list.head.next.next.next.next = new ListNode(5);
		
		printList(head);
		System.out.println();
		System.out.println("Reversed List");
		head = reverseBetween(head,2,5);
		printList(head);
		
	}
	
	 public static ListNode reverseBetween(ListNode head, int m, int n) {
		 ListNode currentNode=head,prev=null;
		 int count=0;
		 while(m>1)
		 {
		 	prev=currentNode;
		 	currentNode=currentNode.next;
			m--;
			n--;
		 }
		 //System.out.println("m is:"+m+";  n is:"+n);
		 //Here con contains the value of node before the mth node
		 //Tail contains the mth node, after reversal this should be 
		 //linked to (n+1)th node
		 ListNode next=null,con=prev,tail=currentNode; 
		 
		 while(n>0)
		 {
		 	next=currentNode.next;
		 	currentNode.next=prev;
		 	prev=currentNode;
		 	currentNode=next;
		    n--;
		 }
		 
		 //Link the reversed list using con and tail
		
		if(con!=null)
		{
			 con.next=prev;
		}
		else
		{
			 head=prev;
		}
		 
		 tail.next=currentNode;
		 
		 return head;
	 }

}
