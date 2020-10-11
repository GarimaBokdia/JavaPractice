package com.prep.GoldmanSachs;
/*
 * Ugly numbers are numbers whose only prime factors are 2, 3 or 5. 
 * The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers.
 * By convention, 1 is included.
 */

/*
 * Brute Force solution : SPACE COMPLEXITY O(1)
 * 
This function divides a by greatest 
    divisible power of b
    static int maxDivide(int a, int b) 
    { 
        while(a % b == 0) 
            a = a/b; 
        return a; 
    } 
      
    Function to check if a number  
    is ugly or not 
    static int isUgly(int no) 
    { 
        no = maxDivide(no, 2); 
        no = maxDivide(no, 3); 
        no = maxDivide(no, 5); 
          
        return (no == 1)? 1 : 0; 
    } 
 * 
 */

/**
 * Java program to find nth ugly number 
 * Overlapping DP Solution : Here is a time efficient solution with O(n) extra space.
 * Time Complexity: O(n)
 * Auxiliary Space: O(n)
 * @author garijain
 *
 */
public class UglyNumberDP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=150;
		UglyNumberDP u = new UglyNumberDP();
		System.out.println("nth ugly number is :"+printUglyNumber(n));

	}
	
	public static int printUglyNumber(int n)
	{
		//Array to store ugnly numbers
		int uglyNos[]=new int[n];
		int i2=0,i3=0,i5=0;
		int next_multiple_of_2 = 2; 
        int next_multiple_of_3 = 3; 
        int next_multiple_of_5 = 5; 
        int next_ugly_no = 1; 
        
        uglyNos[0]=next_ugly_no;
     //LOGIC   
        for(int i=1;i<n;i++)
        {
        	next_ugly_no = Math.min(next_multiple_of_2, Math.min(next_multiple_of_3, next_multiple_of_5));
            uglyNos[i]=next_ugly_no;
            
            //Check if ugly number selected was multiple of 2
            //then increase i2 counter to keep track of factors of 2
            if(next_ugly_no == next_multiple_of_2)
            {
            	i2 = i2+1; 
            	next_multiple_of_2= uglyNos[i2]*2;
            }
            if(next_ugly_no == next_multiple_of_3)
            {
            	i3 = i3+1; 
            	next_multiple_of_3= uglyNos[i3]*3;
            } if(next_ugly_no == next_multiple_of_5)
            {
            	i5 = i5+1; 
            	next_multiple_of_5= uglyNos[i5]*5;
            }
        }
        
        
		return next_ugly_no;
	}

}

/*
 *LOGIC:
 *every number can only be divided by 2, 3, 5, 
 *one way to look at the sequence is to split the sequence to three groups as below:
     (1) 1×2, 2×2, 3×2, 4×2, 5×2, …
     (2) 1×3, 2×3, 3×3, 4×3, 5×3, …
     (3) 1×5, 2×5, 3×5, 4×5, 5×5, …

     We can find that every subsequence is the ugly-sequence itself (1, 2, 3, 4, 5, …) 
     multiply 2, 3, 5. Then we use similar merge method as merge sort, 
     to get every ugly number from the three subsequence.
      Every step we choose the smallest one, and move one step after. 
*/