package com.practice.graph;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;

//This class represents a directed graph using adjacency list 
//representation 
public class DepthFirstSearch {
	
	
	private void DFSVertex(int vertex,ArrayList<Integer> neighbours,
			boolean[] visited,ArrayList<Integer> dfsPath) {
		
		//Mark the current node as visited and print it
		visited[vertex]=true;
		dfsPath.add(vertex);
		
		//Recurse through all the neighbours
		ListIterator<Integer> lstNeighbors = neighbours.listIterator();
		while(lstNeighbors.hasNext())
		{
			//Get the neighbor
			int next = lstNeighbors.next();
			//Check if not visited
			if(!visited[next])
			{
				DFSVertex(next,neighbours,visited,dfsPath);
			}
		}
		
	}
	
	/*
	list : adjacency list of graph
	noOfVertices : number of vertices
	return a list containing the DFS traversal of the given graph
	*/
	//The function to do DFS traversal. It uses recursive helper function DFSVertex
	private ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> list,
			int noOfVertices) {
		//Mark all the vertices as not visited
		boolean[] visited = new boolean[noOfVertices];
		ArrayList<Integer> dfsPath = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++)
		{
			if(!visited[i])
			{
				DFSVertex(i,list.get(i),visited,dfsPath);
			}
		}
		return dfsPath;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//total testcases
		int t = sc.nextInt();
		//Output in single string
		StringBuilder sb = new StringBuilder();
		while (t > 0) {
			//total nodes
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(); 
			int noOfVertices = sc.nextInt();
			int noOfEdges = sc.nextInt();
			
			//For each vertex we have to store vertices
			for(int i=0;i<noOfVertices;i++)
			{
				list.add(i,new ArrayList());				
			}
			
			for(int i=1;i<= noOfEdges;i++)
			{
				//Edge entry between u and v nodes
				int u = sc.nextInt();
				int v = sc.nextInt();
				
				//Undirectional graphs so edges are entered with both vertices
				//from the list get vertex u and add v to its details
				list.get(u).add(v);
				//from the list get vertex v and add u to its details
				list.get(v).add(u);
			}
			
			ArrayList<Integer> res = new DepthFirstSearch().dfs(list,noOfVertices);
			for(int i =0; i<res.size();i++)
			{
				System.out.println(res.get(i)+" ");
			}
			t--;
		}
		sc.close();

	}

	

}
