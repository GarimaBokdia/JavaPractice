package com.prep.GoldmanSachs;

public class TrappingRainWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int dropsCollected = trap(arr);
		System.out.println(dropsCollected);
	}
	/*
	 *Basic Insight: 
An element of the array can store water if there are higher bars on left and right. 
The amount of water to be stored in every element can be found out by finding the heights 
of bars on the left and right sides. The idea is to compute the amount of water that can be 
stored in every element of the array. 
Example 

Consider the array {3, 0, 0, 2, 0, 4}, three units of water can be stored three indexes
 1 and 2, and one unit of water at index 3, and three units of water at index 4. 

	 */
	 public static int trap(int[] height) {
		 int rainWaterBucket = 0; 
		 int leftMax=0,rightMax=0;	 
		 int leftIndex=0, rightIndex=height.length-1;
		
		 //Traversing through the array using two pointers 
		 while(leftIndex <= rightIndex) {
			 //If bar on left is smaller than it will be decisive factor
			 if(height[leftIndex]<height[rightIndex])
			 {
				 //if current bar on left is bigger than left max then reset it as it will be decisiove factor
				 //else collect the water in the rain water bucket requal to difference of these
				 if(height[leftIndex]>leftMax)
					 leftMax=height[leftIndex];
				 else
					 rainWaterBucket += leftMax-height[leftIndex];
				 
				 leftIndex++;
				 
			 }
			 else
			 {
				 if(height[rightIndex]>rightMax)
					 rightMax=height[rightIndex];
				 else 
					 rainWaterBucket += rightMax-height[rightIndex];
				 
				 rightIndex--;
			 }
			 
		 }
		 return rainWaterBucket;
	 }
}
