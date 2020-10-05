package com.practice.puzzles;

import java.util.Scanner;

public class CountSquares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			long n = sc.nextLong();
			
		    int res= countSquares(n); 
			
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static int countSquares(long n) {
		int count=0;
		for(int i=1;i*i<n;i++)
		{
			count++;
		
		}
		return count;
	}

}
