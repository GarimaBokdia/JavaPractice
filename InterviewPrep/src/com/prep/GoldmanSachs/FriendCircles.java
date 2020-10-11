package com.prep.GoldmanSachs;

public class FriendCircles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  int[][] friends = {{1,1,0},
	  					 {1,1,0},
	  					 {0,1,1}};
	  					 
	 System.out.println("Total friend circles"+findFriendGroups(friends));
	  					 
	}
	public static int findFriendGroups(int[][] friends)
	{
		int noOfGroup=0;
		if(friends!=null)
		{
			boolean[] visited=new boolean[friends.length];
			for(int i=0;i<friends.length-1;i++)
				visited[i]=false;
				
			for(int frn=0;frn<friends.length;frn++)
			{
			   //If this frn is not visited i.e. part of other group the check its possible friend group
				if(!visited[frn])
				{
				visited[frn]=true;
				noOfGroup++;
				findfriends(friends,visited,frn);
				}
			}	
				
		}
		return noOfGroup;
	}
	/*
	 * Recursively find friends and mark them visited too till all the students reachable
	 * from 'frn' are covered.
	 */
	public static void findfriends(int[][] friends,boolean[] visited,int frn)
	{
		for(int curr=0;curr<friends.length;curr++)
		{
		  if(!visited[curr] && frn!=curr && friends[frn][curr]==1)
		  {
		     visited[curr]=true;
		     findfriends(friends,visited,curr);
		  }
		}
	}
}
