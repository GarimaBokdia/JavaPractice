package com.practice.puzzles;

import java.util.Scanner;

public class TriangularNumber {

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
			
		    int res= isNumTriangular(n); 
			
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}
	private static int isNumberTriangular(long n)
	{
		int res=1;		
		long num=n;
		if(num==1 || num==3)
		{
			return res;
		}
		if(num%2==0)
		{
			for(int i=1;i<=n/2;i++)
			{
				if(num!=0)
				{
					num=num-i;
				}
				else
				{
					break;
				}
				System.out.println("Number "+num+"; i-"+i);  	
			  	
			}
		}
		else
		{
			for(int i=1;i<n/2;i++)
			{
				

				if(num!=0)
				{
					num=num-i;
				}
				else
				{
					break;
				}
				System.out.println("Number "+num+"; i-"+i);  	
			  	
			}
		}
		
		System.out.println("Subracted n"+num);
		if(num!=0)
		{
			res=0;
		}
		return res;
	}

	
	private static int isNumTriangular(long num)
	{
		/*
		 * n(n+1)/2 = num
		 * n(n+1)=2*num
		 * here we can put n= sqrt(2*N)
		 * 
		 */
		long n=(long)Math.floor(Math.sqrt(2*num));
		if(n*(n+1)==2*num)
		{
			return 1;
		}
		return 0;
	}
}
