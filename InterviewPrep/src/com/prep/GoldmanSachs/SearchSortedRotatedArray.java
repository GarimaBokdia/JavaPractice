package com.prep.GoldmanSachs;

public class SearchSortedRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,0,1,2};
		int target =0;
		System.out.println("Index of search "+search(arr,target));

	}

	public static int search(int[] nums, int target) {
        int beginIndex=0,endIndex=nums.length-1;
        int index = searchArr(nums,beginIndex,endIndex,target);                 
        return index;
    }
    
    public static int searchArr(int[] nums,int beginIndex,int endIndex,int target)
    {
        if(beginIndex<=endIndex)
        {
             int midIndex = beginIndex + (endIndex - beginIndex)/2 ;
             //Search in th right subarray
            if(nums[midIndex]==target)
            {
                return midIndex;
            }
            
            /* If arr[begin...mid] first subarray is sorted */
            if(nums[midIndex]>=nums[beginIndex])
            { /* As this subarray is sorted, we  can quickly check if key lies in half or other half */
            	if(target>=nums[beginIndex] && target<=nums[midIndex])
            	{
                    return searchArr(nums,beginIndex,midIndex-1,target);  
            	}
            	else/*If key not lies in first half subarray,Divide other half  into two subarrays,such that we can quickly check if key lies
                    in other half */
            	{
            		return searchArr(nums,midIndex+1,endIndex,target);
            	}
            }
            else   /* If arr[l..mid] first subarray is not sorted,then arr[mid... h] must be sorted subarry*/
            {
            	if(target>=nums[midIndex] && target<=nums[endIndex])
            	{
            		return searchArr(nums,midIndex+1,endIndex,target);
            		  
            	}
            	else/*If key not lies in first half subarray,Divide other half  into two subarrays,such that we can quickly check if key lies
                    in other half */
            	{
            		return searchArr(nums,beginIndex,midIndex-1,target);
            	}
            	
            }
                 
        }
        return -1;
    }
}
