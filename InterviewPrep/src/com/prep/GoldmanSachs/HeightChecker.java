package com.prep.GoldmanSachs;

import java.util.Arrays;
public class HeightChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int heights[]={5,1,2,3,4};
        int countSwaps=heightChecker(heights); 
        System.out.println(countSwaps);
	}
    
    public static int heightChecker(int[] heights)
    {
      int len= heights.length;
      int[] sortedHeights =  new int[len];
      System.arraycopy(heights,0,sortedHeights,0,len);
      Arrays.sort(sortedHeights);
      int swaps=0;
      for(int i=0;i<len;i++)
      {
         if(heights[i]!=sortedHeights[i])
         {
           swaps++;
         }
      }
      return swaps;
    }
}
