package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountOfPossibleTriangles {

	/**
	 * If 3 lengths are given, we can form a unique triangle. 
	 * That is , one & only one triangle, provided the sum of any 2 lengths 
	 * should be greater than the third length. 
	 * If it is not so then no triangle can be formed.
	 * This is the condition , what is called SSS congruence condition.
	 */
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		int t=sc.nextInt();
		long res=0;
		while(t>0)
		{
	
			int n = sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
		
		    res =countNoOfPossibleTriangles(a,n);
		   	sb.append(res+"\n");
			t--;
		}
		System.out.print(sb.toString());
	sc.close();
	
	}

	private static long countNoOfPossibleTriangles(int[] a, int n) {
		int countTraingle=0;
		Arrays.sort(a);
		System.out.println("Sorted array :");
		      for (int i = n - 1; i >= 1; i--) { 
	            int l = 0, r = i - 1; 
	            while (l < r) { 
	                if (a[l] + a[r] > a[i]) { 
	  
	                    /*
	                     * If it is possible with a[l], a[r] and a[i] then it is also possible
	                     * with a[l+1]..a[r-1], a[r] and a[i]      
	                     */
	                      countTraingle += (r-l);
	  
	                    // checking for more possible solutions 
	                    r--; 
	                } 
	                else // if not possible check for 
	                // higher values of arr[l] 
	                { 
	                    l++; 
	                } 
	            } 
	        } 
	   

		return countTraingle;
	}

}
