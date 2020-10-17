package com.practice.slidingwindow;

/*
The technique can be best understood with the window pane in bus,
consider a window of length n and the pane which is fixed in it of length k. 
Consider, initially the pane is at extreme left i.e., at 0 units from the left. 
Now, co-relate the window with array arr[] of size n and pane with current_sum of size k elements.
Now, if we apply force on the window such that it moves a unit distance ahead. 
The pane will cover next k consecutive elements.

Applying sliding window technique :

1. We compute the sum of first k elements out of n terms using a linear loop and store
the sum in variable window_sum.
2. Then we will graze linearly over the array till it reaches the end and 
simultaneously keep track of maximum sum.
3. To get the current sum of block of k elements just subtract the 
first element from the previous block and add the last element of the current block .

We can use this technique to find max/min k-subarray, XOR, product, sum, etc.
*/

public class SlidingWindowsTechnique {

	/**
	 * calculate the maximum sum of ‘k’ consecutive elements in the array of n elements
	 */
	public static void main(String[] args) {
		int arr[]={100, 200, 300, 400};
		int elements=2;
		System.out.println(maxSumSubArraySW(arr,elements));
	}
	
	// O(n*k) solution for finding maximum sum of a subarray of size k 
	public static int maxSumSubArrayBF(int[] arr,int elmtCount)
	{ 
		int maxSum=0,sum=0;
		for(int i = 0 ; i< (arr.length-elmtCount+1);i++)
		{
		    sum = 0;
			for(int j=0;j<elmtCount;j++)
			{
			   sum += arr[i+j];
			}
			
			maxSum=Math.max(sum,maxSum);
		}
		
		return maxSum;
	}


  public static int maxSumSubArraySW(int[] arr,int elmtCount)
	{ 
		int size=arr.length;
		int windowSum=0,maxSum=0;
		
		//Invalid Case
		if(size<elmtCount)
		 return -1;
		
		 // Step 1: Compute sum of first window of size elmtCount and assign it to maxSum
		 for(int i=0;i<elmtCount;i++)
		 {
		   maxSum+= arr[i];
		 }
		 
		 //Step 2 : Assign to windowSum
		 windowSum=maxSum;
		 
		//Step 3: Compute sums of remaining windows by removing first element of previous 
        // window and adding last element of current window 
		 for(int i=elmtCount;i<size;i++)
		 {
		 	//Slide a window
		 	windowSum = windowSum + arr[i] - arr[i-elmtCount];
		 	//Assign Max value
		 	maxSum = Math.max(maxSum,windowSum);
		 }
		
		return maxSum;
	}

}
