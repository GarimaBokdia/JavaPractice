package com.prep.GoldmanSachs;

public class TrappingRainWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		int dropsCollected = trap(arr);
		System.out.println(dropsCollected);
	}
	/*
	 * Algorithm: 
Traverse the array from start to end.
For every element, traverse the array from start to that index and find the maximum height (a) and traverse the array from the current index to end and find the maximum height (b).
The amount of water that will be stored in this column is min(a,b) – array[i], add this value to total amount of water stored
Print the total amount of water stored.
	 */
	 public static int trap(int[] height) {
		 int rainWater = 0; 
		    
		 
		 int left=0, right=0;
		 for(int i=1;i<height.length-1;i++)
		 {
			 // Find maximum element on its left 
			 left=height[i];
			 for(int j=0;j<i;j++)
			 {
				 left=Math.max(left, height[j]);
			 }
			 
			// Find maximum element on its rigth 
			 right=height[i];
			 for(int j=i+1;j<height.length;j++)
			 {
				 right=Math.max(right, height[j]);
			 }
			 
			 rainWater += Math.min(left,right)-height[i];
			 
		 }
		 
		 return rainWater;
	 }
}
