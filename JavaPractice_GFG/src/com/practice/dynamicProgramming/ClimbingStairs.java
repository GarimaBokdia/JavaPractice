package com.practice.dynamicProgramming;

public class ClimbingStairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        int stairs = 4, possibleWays = 2; 
        System.out.println("Number of ways = "
                           + countWays(stairs, possibleWays)); 

	}
	// Java program to count number of ways 
	// to reach n't stair when a person 
	// can climb 1, 2, ..m stairs at a time 
	 // Returns number of ways to reach s'th stair 
    static int countWays(int s, int m) 
    { 
        return countWaysUtil(s + 1, m); 
    } 
    /*
     * Time Complexity: O(m*n)
     * Auxiliary Space: O(n)
     */
    static int countWaysUtil(int stairs,int possibleWays)
    {
    	  int res[] = new int[stairs]; 
          res[0] = 1; 
          res[1] = 1; 
          for (int i = 2; i < stairs; i++) { 
              res[i] = 0; 
              for (int j = 1; j <= possibleWays && j <= i; j++) 
                  res[i] += res[i - j]; 
          } 
          return res[stairs - 1]; 
    }
    
    /*
     *  The third method uses the technique of Sliding Window to arrive at the solution.
Approach: This method efficiently implements the above Dynamic Programming approach.
In this approach for the ith stair, we keep a window of sum of last m possible stairs from
which we can climb to the ith stair. Instead of running an inner loop, we maintain the
result of the inner loop in a temporary variable. 
We remove the elements of the previous window and add the element of the current window and update the sum
     */

}
