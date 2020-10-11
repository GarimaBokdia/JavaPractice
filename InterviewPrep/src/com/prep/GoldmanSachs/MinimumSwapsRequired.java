package com.prep.GoldmanSachs;

public class MinimumSwapsRequired {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int heights[]= 	{5,1,2,3,4};
			//{1,1,4,2,1,3};
		System.out.println("Swaps required "+heightChecker(heights));
		
	}
	static String toString(int arr[])
	{
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			s=s+arr[i]+" ";
		}
		return s;
	}
	
	public static int heightChecker(int[] heights) {
        int count=0;
    	System.out.println("INPUT :" +toString(heights));

        for(int i=0;i<heights.length-1;i++){
        	for(int j=i;j<heights.length;j++)
        	{
        		//SWAP
        		if(heights[j]<heights[i])
        		{
        			int temp = heights[j];
        			heights[j] = heights[i];
        			heights[i]=temp;
        			count++;
        			break;
        		}
        	}
        	System.out.println("ITEAR :" +toString(heights));
         }
        return count;
    }
}
