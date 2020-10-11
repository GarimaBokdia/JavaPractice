package com.prep.GoldmanSachs;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SquareSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {-7,-3,2,3,11};
			//{-4,-1,0,3,4,10};
		int o[] = sqareSortedFast(arr);
		for(int i=0;i<o.length;i++)
		{
			System.out.print(o[i]+" ");
		}
	}

	private static int[] sqareSortedFast(int[] arr) {
		  int[] results = new int[arr.length];
	      int right = arr.length-1;
	      int zeroIndex=0;
	      while(right>=0)
	      {
	    	  if(arr[right]==0)
	    	  {
	    		  zeroIndex=right;
	    	  }
	    	  else if (arr[right]<0)
	    	  {
	    		  zeroIndex=right;
	    		  break;
	    	  }
	    	  right--;
	      }
	      int negIndex=zeroIndex-1;
	      int resIndex=0;
	     //To put results 
	      int i=zeroIndex;
	    while(i<arr.length )
	    {
	    	int square=arr[i]*arr[i];
	    	if(negIndex>=0 && arr[negIndex]*arr[negIndex]<square)
	    	{
	    		square=arr[negIndex]*arr[negIndex];
	    		negIndex--;
		    }
	    	else
	    	{
	    		i++;
	    	}
	    	results[resIndex]=square;
	    	resIndex++;
	    
	    }
	      
	      return results;
	}
	
	//Very Poor performance
	private static int[] sqareSorted(int[] arr) {
        
        int op[]=new int[arr.length];

		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			if(map.containsKey(Math.abs(arr[i])))
			{
				count = map.get(Math.abs(arr[i]));
            }
				count++;
				map.put(Math.abs(arr[i]), count);
			
		}
		
		int index=0;
		for(Entry<Integer, Integer> entry : map.entrySet())
		{
			Integer occr=entry.getValue();
			while(occr>0)
			{
				op[index]=(entry.getKey())*(entry.getKey());
				occr--;
				index++;
			}
		}
        
        return op;
        }

}
