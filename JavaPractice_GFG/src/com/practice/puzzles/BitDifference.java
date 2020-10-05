package com.practice.puzzles;

import java.util.Scanner;

/*
 * Output:
For each testcase, in a new line, print the number of bits needed to be flipped.

Constraints:
1 ≤ T ≤ 100
1 ≤ A, B ≤ 103

Example:
Input:
1
10 20
Output:
4

Explanation:
Testcase1:
A  = 01010
B  = 10100
Number of bits need to flipped = 4
 */
public class BitDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		int res;
		while(t>0)
		{		
			res=0;
			int a = sc.nextInt();
			int b = sc.nextInt();
		    res = calcBitsToFlipped(a,b);			
			sb.append(res+"\n");
			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static int calcBitsToFlipped(int a, int b) {
		int pw=0;
		double num=0;
		String binNum="";
		while(num!=a)
		{
			num=num+Math.pow(2, pw);
			
		}
		return 0;
	}

}
