package com.prep.Wissen;

public class BinarySearchIterative {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchIterative bsr = new BinarySearchIterative();
		//Takes sorted array as input
		int arr[] = {2, 3, 4,6,7,8, 10,14,17, 23,32,34,46,47,53,58,61,67,75,79,80};
		int n = arr.length;
		//search element
		int x = 75; 
		
		int result = bsr.BinarySearch(arr,x);
		if(result != -1)
		{
			System.out.println("Element "+x+" Found at index "+result);
		}
		else
		{
			System.out.println("Element not found");
		}
		

	}
	
	public int BinarySearch(int[] arr, int searchElement)
	{
		int endIndex=arr.length-1,beginIndex=0;
		while(beginIndex <= endIndex)
		{
			int mid = beginIndex + (endIndex-beginIndex)/2 ;
			//System.out.println("Mid index is:"+mid);
			//If element is present at mid 
			if(arr[mid]==searchElement)
				return mid;		

            // If element is smaller than mid, then it can only be present in left subarray 
			if(arr[mid]> searchElement)
				endIndex=mid-1;
			else // Else the element can only be present in right subarray 
				beginIndex=mid+1;
		}
		return -1;
	}

}
