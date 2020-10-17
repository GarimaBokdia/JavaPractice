package com.prep.Wissen;

import java.util.HashMap;

public class PairWithTargetDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {8, 12, 16, 4, 0, 20}; 
			//{1, 5, 3, 4, 2}; 
			//{2,1,3,4,5,6,7}; 
		//{1, 2, 90, 10, 110}; 
		int target =4;
		System.out.println(pairTargetDifference(arr,target));

	}
	
	public static int pairTargetDifference(int[] arr,int target)
	{
		HashMap<Integer,Integer> arrValSet = new HashMap<Integer,Integer>(); 
		int countPairs=0;
		for(int i=0;i<arr.length;i++)
		{
			arrValSet.put(arr[i],i);
		}
		
		System.out.println(arrValSet);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" Checking for :"+((arr[i]+target)));

			if(arrValSet.containsKey((arr[i]+target)))
			{
				System.out.println("Found it at index"+arrValSet.get((arr[i]+target)));
				countPairs++;
			}
		}
		return countPairs;
	}

}
