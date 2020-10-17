package com.practice.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given an array arr[] consisting of N positive integers, the task is to
 *  find a subarray of length K such that concatenation of each element of 
 *  the subarray is divisible by X. If no such subarray exists, then print “-1”.
 *  If more than one such subarray exists, print any one of them.
 *  
 *  Input: arr[] = {1, 2, 4, 5, 9, 6, 4, 3, 7, 8}, K = 4, X = 4
Output: 4 5 9 6
Explanation:
The elements of the subarray {4, 5, 9, 6} concatenates to form 4596, which is divisible by 4.

Input: arr[] = {2, 3, 5, 1, 3}, K = 3, X = 6
Output: -1
 */
public class SubarrayDivisibleK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int arr[] = {1, 2, 4, 5, 9, 6, 4, 3, 7, 8};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 9, 6, 4, 3, 7, 8));
		int K = 4; //subarray of K elements
		int X = 4; //divisible by X
		
		System.out.println(findSubarray(list,K,X));

	}
	// Function to return the starting index of the subarray whose concatenation is divisible by X
	private static int findSubarray(ArrayList<Integer> list, int k, int x) {
		int num=0;
		
		//Generate the concatenation of first K length subarray
		int i;
		for(i=0;i<k;i++)
		{
			num = num*10 + list.get(i);
		}
		
		//check If first num is divisible by Zero, return 0 as index
		if(num%x==0)
			return 0;
			
		for(int j=i;j<list.size();j++)
		{
			//Remove first digit and append next digit 
			num = (num % (int)Math.pow(10,j-1))*10 + list.get(j);
			
			if(num%x==0)
			{
				return (j-i+1);
			}
			
		}
		
		return num;
		
	}

}
