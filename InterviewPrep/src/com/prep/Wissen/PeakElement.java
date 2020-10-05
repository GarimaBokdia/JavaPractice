package com.prep.Wissen;
/*
 * Algorithmic Paradigm: Divide & Conquer
 * Divide and Conquer can be used to find a peak in O(Logn) time. 
 * The idea is based on the technique of Binary Search to check if
 * the middle element is the peak element or not. 
 * If the middle element is not the peak element, 
 * then check if the element on the right side is greater than 
 * the middle element then there is always a peak element on the right side.
 *  If the element on the left side is greater than the middle element then 
 *  there is always a peak element on the left side.
 *  Form a recursion and the peak element can be found in log n time.
Time Complexity: O(Logn)
 */
public class PeakElement {

	/**
	 * Given an array of integers. Find a peak element in it. An array element is a peak if
	 * it is NOT smaller than its neighbours. For corner elements, we need to consider only
	 * one neighbour.
	 * Input: array[]= {5, 10, 20, 15}
Output: 20
The element 20 has neighbours 10 and 15,
both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
The element 20 has neighbours 10 and 15, 
both of them are less than 20, similarly 90 has neighbous 23 and 67.

CORNER CASES
If input array is sorted in strictly increasing order, the last element is always a peak element. For example, 50 is peak element in {10, 20, 30, 40, 50}.
If the input array is sorted in strictly decreasing order, the first element is always a peak element. 100 is the peak element in {100, 80, 60, 50, 20}.
If all elements of input array are same, every element is a peak element.

	 */
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {100, 80, 60, 50, 20};
			//{10,20, 15, 2, 23, 90, 67};
        int n = arr.length; 
        System.out.println( 
            "Index of a peak point is " + findPeak(arr,0,n-1,n)); 
	}
	
	public static int findPeak(int arr[],int left,int right,int length)
	{
		
		int mid=0;
		if(left<=right)
		{
			mid= (left+right)/2;
			
			//check if mid element is peak element			
			if((mid==0||arr[mid]>=arr[mid-1]) && (mid==(length-1) || arr[mid]>=arr[mid+1]))
			{
				return mid;
			}
			//If mid element is smaller than the element before then peak 
			//may be found in first part of array
			else if(mid > 0 && arr[mid] < arr[mid-1])
			{
				return findPeak(arr,left,mid-1,length);
			}
			//If mid element is greater than the element after then peak 
			//may be found in the second part of array
			else 
			{
				return findPeak(arr,mid+1,right,length);
			}
		}
		return -1;
	}

}
