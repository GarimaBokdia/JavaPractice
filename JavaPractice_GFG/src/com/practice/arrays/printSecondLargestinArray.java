package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class printSecondLargestinArray {

	/**
	 * @param args
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
		
		    res =printSecondLargest(a,n);
		   	sb.append(res+"\n");
			t--;
		}
		System.out.print(sb.toString());
	sc.close();
	
	}

	private static long printSecondLargest(int[] a, long n) {
		Arrays.sort(a);	
		return (a[(int)(n-2)]);
	}

}
