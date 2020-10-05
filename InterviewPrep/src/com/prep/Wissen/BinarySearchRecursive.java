package com.prep.Wissen;

public class BinarySearchRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchRecursive bsr = new BinarySearchRecursive();
		//Takes sorted array as input
		int arr[] = {2, 3, 4,6,7,8, 10,14,17, 23,32,34,46,47,53,58,61,67,75,79,80};
		int n = arr.length;
		//search element
		int x = 75; 
		
		int result = bsr.BinarySearch(arr, 0, n-1, x);
		if(result != -1)
		{
			System.out.println("Element "+x+" Found at index "+result);
		}
		else
		{
			System.out.println("Element not found");
		}
		

	}
	
	public int BinarySearch(int[] arr, int beginIndex,int endIndex,int searchElement)
	{
		if(endIndex>beginIndex)
		{
			int mid = beginIndex + (endIndex-beginIndex)/2 ;
			//System.out.println("Mid index is:"+mid);
			//If element is present at mid 
			if(arr[mid]==searchElement)
				return mid;
			

            // If element is smaller than mid, then it can only be present in left subarray 
			if(arr[mid]> searchElement)
				return BinarySearch(arr, beginIndex, mid-1, searchElement);
			else // Else the element can only be present in right subarray 
				return BinarySearch(arr, mid+1, endIndex, searchElement);
		}
		return -1;
	}

}
