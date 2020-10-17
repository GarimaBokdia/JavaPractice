package com.practice.arrays;

public class MinimumEnergyRequired {

	/**
	 * Given an array containing positive and negative numbers.
	 *  The array represents checkpoints from one end to other end of street.
	 *  Positive and negative values represent amount of energy at that checkpoint. 
	 *  Positive numbers increase the energy and negative numbers decrease. 
	 *  Find the minimum initial energy required to cross the street such that
	 *   Energy level never becomes 0 or less than 0.

Note : The value of minimum initial energy required will be 1 even
 if we cross street successfully without loosing energy to less than 
 	and equal to 0 at any checkpoint. The 1 is required for initial check point.
	 */
	public static void main(String[] args) {
	    int arr[] = {4, -6, 4, 4,-14, 4}; 
	    int n = arr.length; 
	    System.out.print(minInitialEnergy(arr, n)); 
	}
	/*
	 * Time Complexity : O(n)
	 * Auxiliary Space : O(1)
	 */
	public static int minInitialEnergy(int[] arr, int len)
	{
		int minEnrgyReqd=0,currEnergy=0;
		boolean flag= false;
		for(int i=0;i<len;i++)
		{
			currEnergy +=arr[i];
			
			/*
			 *  If current energy, becomes negative or 0,increment initial minimum energy by the
			 *  negative value plus 1. to keep current energy  positive (at least 1).
			 *  Also update current energy and flag. 
			 */
			
			if(currEnergy <=0)
			{
				minEnrgyReqd = Math.abs(currEnergy)+1;
				currEnergy=1;
				flag=true;
			}
		}
		
		return (flag==false)?1:minEnrgyReqd;
	}
}
