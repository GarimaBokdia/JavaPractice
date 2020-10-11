package com.prep.GoldmanSachs;

/*
 * Time Complexity: O(V^3)
 * Example of Optimal DP Approach
 * We initialize the solution matrix same as the input graph matrix as a first step.
 * Then we update the solution matrix by considering all vertices as an intermediate vertex. 
 * The idea is to one by one pick all vertices and updates all shortest paths which include
 * the picked vertex as an intermediate vertex in the shortest path. 
 * When we pick vertex number k as an intermediate vertex,
 * we already have considered vertices {0, 1, 2, .. k-1} as intermediate vertices.
 * For every pair (i, j) of the source and destination vertices respectively, there are two possible cases.
1) k is not an intermediate vertex in shortest path from i to j. We keep the value of dist[i][j] as it is.
2) k is an intermediate vertex in shortest path from i to j. We update the value of dist[i][j] as dist[i][k] + dist[k][j] if dist[i][j] > dist[i][k] + dist[k][j]
 */
public class ShortestPathDP {

	/**
	 * The Floyd Warshall Algorithm is for solving the All Pairs Shortest Path problem.
	 *  The problem is to find shortest distances between every pair of vertices in a given edge weighted directed Graph.
	 */
	public static void main(String[] args) {
		  /* Let us create the following weighted graph 
        10 
     (0)------->(3) 
     |         /|\ 
     5 |          | 
     |          | 1 
     \|/         | 
     (1)------->(2) 
        3           */
		//There are 4 vertices, we will store their distance to each vertex.
		int graph[][]={{0,5,INF,10},
					   {INF,0,3,INF},
					   {INF,INF,0,1},
					   {INF,INF,INF,0}};
				
		ShortestPathDP sps=new ShortestPathDP();
		
		
		System.out.println("Input Distance Matrix");
		printSolution(graph);
		System.out.println();
		System.out.println();

		sps.floydWarshall(graph);
	}
	//no of vertices in the graph
	public static final int V = 4;
	public static final int INF = Integer.MAX_VALUE;
	
	void floydWarshall(int[][] graph){
		int distance[][]=new int[V][V];
		/* We initialize the solution matrix same as the input graph matrix as a first step. */
		for(int i=0;i<V;i++)
		{
			for(int j=0;j<V;j++)
			{
				distance[i][j]=graph[i][j];
			}
		}
        /* Add all vertices one by one to the set of intermediate vertices. 
          ---> Before start of an iteration, we have shortest distances between all pairs of vertices such that 
               the shortest distances consider only the vertices in set {0, 1, 2, .. k-1} as intermediate vertices. 
          ----> After the end of an iteration, vertex no. k is added to the set of intermediate vertices and the set 
                becomes {0, 1, 2, .. k} */
		
		//Considering each k vertex as intermediate vertex
		for(int k=0;k<V;k++)
		{
			for(int i=0;i<V;i++)
			{
				for(int j=0;j<V;j++)
				{
					if(distance[i][k]!=INF && distance[k][j]!=INF && distance[i][k]+distance[k][j]<distance[i][j])
					{
						distance[i][j] = distance[i][k]+distance[k][j];
					}
				}
			}
		}
		
		 // Print the shortest distance matrix 
		 // Print the shortest distance matrix 
		System.out.println("Shortest Distance Matrix");
		printSolution(distance); 	
	}
	
	public static void printSolution(int path[][])
	{
		for(int i=0;i<path.length;i++)
		{
			System.out.print("{");
			for(int j=0;j<path[i].length;j++)
			{
				if(path[i][j]==INF)
					System.out.print("INF ");
				else
					System.out.print(path[i][j]+" ");
			}
			System.out.println("}");
		}
	}

}
