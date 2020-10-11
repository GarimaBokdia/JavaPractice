package com.practice.linkedlist;

import java.util.Scanner;

class NodeLL{
	int data;
	NodeLL next;
	
	NodeLL(int x)
	{
		data=x;
		next=null;
	}
}

public class MiddleElement {
	
	
	
	static void printList(NodeLL head)
	{
		while(head != null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	public int getMiddleElement(NodeLL head)
	{
		NodeLL currNodeFast=head;
		NodeLL currNodeSlow = head;
		//Iterate till last node
		while(null!= currNodeFast && null!=currNodeFast.next )
		{
			//Running Fast pointer such that when it reached the end
			//Slow pinter will reach the middle element
			currNodeFast=currNodeFast.next.next;
			currNodeSlow=currNodeSlow.next;
		}
		if(currNodeSlow!=null)
		{
			return (currNodeSlow.data);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//total testcases
		int t = sc.nextInt();
		//Output in single string
		StringBuilder sb = new StringBuilder();
		while (t > 0) {
			//total nodes
			int n= sc.nextInt();
			//Adding nodes to linkedlist
			NodeLL head = new NodeLL(sc.nextInt());
			NodeLL tail = head;

			for(int i=0;i<n-1;i++)
			{
			tail.next = new NodeLL(sc.nextInt());
			tail=tail.next;
			}
			MiddleElement midElmnt = new MiddleElement();
			int ans = midElmnt.getMiddleElement(head);
			sb.append(ans+" ");
			t--;
		}
		System.out.println(sb.toString());
		sc.close();

	}

}
