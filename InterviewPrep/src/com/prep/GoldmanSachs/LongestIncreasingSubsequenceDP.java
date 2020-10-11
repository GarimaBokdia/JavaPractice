package com.prep.GoldmanSachs;
/*
 * Iteration-wise simulation :

arr[2] > arr[1] {LIS[2] = max(LIS [2], LIS[1]+1)=2}
arr[3] < arr[1] {No change}
arr[3] < arr[2] {No change}
arr[4] > arr[1] {LIS[4] = max(LIS [4], LIS[1]+1)=2}
arr[4] > arr[2] {LIS[4] = max(LIS [4], LIS[2]+1)=3}
arr[4] > arr[3] {LIS[4] = max(LIS [4], LIS[3]+1)=3}
We can avoid recomputation of subproblems by using tabulation as shown in the below code:
 */
public class LongestIncreasingSubsequenceDP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
        int n = arr.length; 
        System.out.println("Length of longest increasing subsequence is " 
                          + LongestIncreasingSubsequence( arr, n ) + "\n" ); 

	}

	private static int LongestIncreasingSubsequence(int[] arr, int n) {
		int lis[] = new int[n];
		int max=0;
		  /* Initialize LIS values for all indexes */
		for(int i=0;i<n;i++)
		{
			lis[i]=1;
		}
		
		  /* Compute optimized LIS values in bottom up manner */
		//checking and comparing with last values
		for(int i=1;i<n;i++)
		{
			System.out.println("i is: "+ i+ " ** ");
			for(int j=0;j<i;j++)
			{
				System.out.print("j is: "+ j);
				System.out.print("  arr[i]: "+ arr[i]+"   arr[j]: "+arr[j]+"  lis[i]: "+lis[i]+"  lis[j]: "+lis[j]);
				if(arr[i]>arr[j] && lis[i] < lis[j]+1)
				{
					lis[i]=lis[j]+1;
					System.out.println(" 'arr[i]>arr[j] && lis[i] < lis[j]+1' => updated lis[i]: "+lis[i]);
				}
			}
			System.out.println();
		}
		/* Pick maximum of all LIS values */
		for(int i=0;i<n;i++)
		{
			if(lis[i]>max)
			{
				max=lis[i];
			}
		}
		return max;
	}

}
