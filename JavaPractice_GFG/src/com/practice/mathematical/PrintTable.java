package com.practice.mathematical;

import java.util.Scanner;

/**
 * Print the table of a given number N. 

Input:
First line contains an integer, the number of test cases 'T'. T testcases follow. Each testcase cotains one line of input denoting N.

Output:
For each testcase, print the table of N upto 10.

Constraints: 
1 <= T <= 100
1 <= N <= 1000

Example:
Input:
1
9 

Output:
9 18 27 36 45 54 63 72 81 90
/
 * 
 * @author garijain
 *
 */
public class PrintTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n= sc.nextInt();
		    printTable(n);
			t--;
		}

	sc.close();
	}

	 static void printTable(int n) {
	StringBuffer sb = new StringBuffer();
	for(int i=1;i<=10;i++)
	{
		sb.append((n*i)+" ");	
	}
	System.out.println(sb.toString().trim());
		
	}

}
