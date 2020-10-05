package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		int t=sc.nextInt();
		int n=0;
		while(t>0)
		{
	
			int N = sc.nextInt();
			int a[]=new int[N];
			for(int i=0;i<N;i++)
			{
				a[i]=sc.nextInt();
			}
			
			if(N>1)
			{
			//n is size of new array without duplicates
		    n =remove_duplicate(a,N);
			}
		    for(int i=0;i<n;i++)
			{
		    	System.out.print(a[i]+" ");
			}
		   	System.out.println();
			t--;
		}
		System.out.print(sb.toString());
	sc.close();
	
	}

	private static int remove_duplicate(int[] a, int N) {
		int n=N;
		int b[]=new int[n];
		Arrays.fill(b, -1);
		for(int i=0;i< N;i++)
		{
			if(a[i]!=-1)
			{
				b[i]=a[i];
				for(int j=i+1;j< N;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=-1;
						n--;
					}
					else
					{
						break;
					}
				}	
			}
			
		}
		int j=0;
		int i=0;
		while(j<N)
		{
			if(b[j]!= -1)
			{
				a[i]=b[j];
				i++;
			}
			j++;
		}
		
		return n;
	}

}
