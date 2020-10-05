package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumofArrayElements {

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
			res=0;
			int n = sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				res=res+a[i];
			}
		
		    
		   	sb.append(res+"\n");
			t--;
		}
		System.out.print(sb.toString());
	sc.close();
	
	}

	
}
