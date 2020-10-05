package com.practice.arrays;

import java.util.Scanner;

public class MinMaxFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		int t=sc.nextInt();
		String res="";
		while(t>0)
		{
	
			int n = sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
		
		    res =findMinMaxFromArray(a,n);
		   	sb.append("\n"+res);
			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	
	}

	private static String findMinMaxFromArray(int[] a, long n) {
		long min=a[0],max=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		return (min+" "+max);
	}

}
