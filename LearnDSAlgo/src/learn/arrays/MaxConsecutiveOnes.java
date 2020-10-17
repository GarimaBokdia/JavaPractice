package learn.arrays;

public class MaxConsecutiveOnes {

	/**
	 * leetcode practice
	 * Given a binary array, find the maximum number of consecutive 1s in this array.

		Example 1:
		Input: [1,1,0,1,1,1]
		Output: 3
		Explanation: The first two digits or the last three digits are consecutive 1s.
		    The maximum number of consecutive 1s is 3.
	 */
	public static void main(String[] args) {
		int nums[]={1,0,1,0,1,1,1,0,0,1,1,1,1};
		MaxConsecutiveOnes mco=new MaxConsecutiveOnes();
		int occrCount=mco.findMaxConsecutiveOnes(nums);
		System.out.println(occrCount);
	}
	 public int findMaxConsecutiveOnes(int[] nums) {
	       int count=0,maxCount=0;
	       for(int i=0;i<nums.length;i++)
	       {	
	       		if(nums[i]==1)
	       		{
	       		 ++count;
	       		}
	       		else
	       		{
	       		 maxCount=Math.max(count,maxCount);
	       		 count=0;
	       		}
	       
	       		
	       }
	       return Math.max(count,maxCount);
	    }
}
