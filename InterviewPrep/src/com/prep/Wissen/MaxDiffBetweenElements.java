package com.prep.Wissen;

public class MaxDiffBetweenElements {

	/**
	 * we take the difference with the minimum element found so far. So we need to keep track of 2 things:
1) Maximum difference found so far (max_diff).
2) Minimum number visited so far (min_element).
	 */
	public static void main(String[] args) {
		MaxDiffBetweenElements md = new MaxDiffBetweenElements();
		int arr[] ={80, 2, 6, 3, 100}; 
			//{1, 2, 90, 10, 110}; 
	    int size = arr.length; 
	    
	    
	    if(size<2)
	    {
	    	System.out.println("Single elmenent array");
	    }
	    else
	    {
	    	System.out.println("MaximumDifference is " +  md.maxDiff(arr, size));	
	    }
	     

	}
	/*
	 * Time Complexity : O(n)
Auxiliary Space : O(1)
	 */
	int maxDiff(int[] arr,int size)
	{ /* The function assumes that there are at least two elements in array. 
	     The function returns a negative value if the array is sorted in decreasing order. 
	     Returns 0 if elements are equal  */
		int max_diff= arr[1]-arr[0];
		int min_elem = arr[0];
		for(int i=1;i<= size-1;i++)
		{
			if(arr[i]-min_elem > max_diff)
			{
			  max_diff=arr[i]-min_elem;
			}
			
			if(arr[i]<min_elem)
			{
				min_elem = arr[i];
			}
		}
		return max_diff;
	}

}
