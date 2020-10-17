package com.practice.linkedlist;

import java.util.HashSet;

public class DetectALoopLL {

  static class Node{
	  Node next;
	  int val;
	  Node(int val)
	  {
		  this.val=val;
		  this.next=null;
	  }
  }
  
  static Node head;
  
  public void push(int val)
  {
	  Node newNode=new Node(val);
	  newNode.next = head;
	  /* 4. Move the head to point to new Node */
	  head=newNode;
  }
	public static void main(String[] args) {
		//Create a linked list and push new nodes ot it at the front
		DetectALoopLL list = new DetectALoopLL();
		//10 -> 15 -> 4 -> 20
		list.push(20);
		list.push(4);
		list.push(15);
		list.push(10);
		  /*Create loop for testing */
        list.head.next.next.next = list.head;

        //if(detectLoop(head))
		if(detectLoopTwoPointer())
        {
        	System.out.println("There is a loop in a linkedlist");
        }
        else
        {
        	System.out.println("There is no loop in a linkedlist");
        }
        
	}
	 
	/*
	 * Using hashset property
	 * TimeComplexity = O(n)
	 * Space Complexity = O(n) 
	 */
	static public boolean detectLoop(Node currNode){
		HashSet<Node> set = new HashSet<Node>();
		
		while(currNode != null)
		{
			//If set already has this node than we can say there is a loop oin linked list
			if(set.contains(currNode))
			{
				return true;
			}
			set.add(currNode);
			currNode = currNode.next;
		}
		return false;
	}
	
	/*
	 * Using Floyd’s Cycle-Finding Algorithm
	 * Traverse linked list using two pointers.
	 * Move one pointer(slow_p) by one and another pointer(fast_p) by two.
	 * If these pointers meet at the same node then there is a loop.
	 * If pointers do not meet then linked list doesn’t have a loop.
	 * TimeComplexity = O(n)
	 * Space Complexity = O(1) 
	 */
	static public boolean detectLoopTwoPointer(){
		Node slowPointer = head,fastPointer = head;
		boolean meetFlag = false; 
		
		while(slowPointer!=null && fastPointer != null && fastPointer.next !=null)
		{
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			//Place this condition below the assignments because initially both are
			//head and this condition will get always true, and its not a loop
			//After assignments check if both pointers are at same node then its a loop
			if(slowPointer==fastPointer)
			{
				meetFlag=true;
				break;
			}
		}
		return meetFlag;
	}

}
