package com.prep.Wissen;
/*
 * Algorithmic Paradigm: Divide & Conquer
Time Complexity: O(Logn)
 */
public class FixedPoint {

	/**
	 * Given an array of n distinct integers sorted in ascending order, 
	 * write a function that returns a Fixed Point in the array, if there is
	 * any Fixed Point present in array, else returns -1. Fixed Point in an array is an 
	 * index i such that arr[i] is equal to i. Note that integers in array can be negative.
	 *  Input: arr[] = {-10, -5, 0, 3, 7}
  Output: 3  // arr[3] == 3 

  Input: arr[] = {0, 2, 5, 8, 17}
  Output: 0  // arr[0] == 0 


  Input: arr[] = {-10, -5, 3, 4, 7, 9}
  Output: -1  // No Fixed Point
	 */
	public static void main(String[] args) {
		int arr[] = {-10, -1, 0, 3 , 10, 11, 30, 50, 100}; 
        int n = arr.length; 
        System.out.println("Fixed Point is " 
                   + binarySearch(arr,0, n-1));  

	}

	private static int binarySearch(int[] arr, int left, int right) {
		int mid = (left+right)/2;
		System.out.println("Left:"+left+"; Right: "+right+"; Mid: "+mid);
		if(left<=right)
		{
		if(arr[mid]==mid)
			return mid;
		
		//if mid element is greater then index; look in lower side if we can find 
		//any mid element same as index value
		if(arr[mid]>mid)
			return binarySearch(arr,left,mid-1);
		else
			return binarySearch(arr,mid+1,right);
		}
		return -1;
	}

}
