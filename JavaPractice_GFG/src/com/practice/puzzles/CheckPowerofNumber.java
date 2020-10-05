package com.practice.puzzles;

import java.util.Scanner;
/*
 * Given two positive numbers x and y, check if y is a power of x or not.

Input:
First line contains an integer, the number of test cases 'T'. Each test case should contain two positive numbers x and y.

Output:
Print 1 if y is a power of x, else print 0.
Example:
Input:
2
2 8
1 3
Output:
1
0
 */
public class CheckPowerofNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			int res=0;
			long x = sc.nextLong();
			long y = sc.nextLong();
			if(x==1 && y==1)
			{
				res=1;
			}
			else
			{
				double op= Math.log(y)/Math.log(x);
				if((int)op==op)
				res=1;
				
			}
			
			
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

}
