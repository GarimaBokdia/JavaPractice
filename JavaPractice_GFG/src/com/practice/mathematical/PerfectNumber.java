package com.practice.mathematical;

import java.util.Scanner;

public class PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			long a1 = sc.nextLong();
			
		    int res= isPerfectNumber(a1); 
			
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}
/**
 * 
 * 36 - 1,2,3,4,6,9,12,18,36
 * (1,36),(2,18),(3,12),(4,9),(6,6)
 * @return
 */
	private static int isPerfectNumber(long n) {
		int isPerfect=0;
		boolean flag=true;
		//As we have to exclude number itself from the factors,
		//so removing 1 from the loop also. But 1 should be considered as factor 
		//hence initializing sum with 1 
		long sum=1;
		for(long i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				
				if(n/i==i)
				{
					sum=sum+i;
					
				}
				else				
				{
					sum=sum+i+(n/i);
					
				}
				
				
			}
			
			if(sum>n && i!=Math.sqrt(n))
			{
				flag=false;
				break;
			}
		}
				
		if(sum==n && flag )
		{
			isPerfect=1;
		}
		return isPerfect;
	}

}
