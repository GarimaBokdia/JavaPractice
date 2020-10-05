package com.practice.mathematical;

import java.util.Scanner;

public class LargestPrimeFactor {

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
			
		    long lpf= findLargestPrimeFactor(a1); 
			
			sb.append(lpf+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static long findLargestPrimeFactor(long n) {
	
		boolean isPrime=false;
		long primefactor=0;
		
		
		while(n%2==0)
		{
			n=n/2;
			primefactor=2;
		}
		
		
		for(long i=3;i<Math.sqrt(n);i++)
		{
			System.out.println("i:"+i+"; prime factor:"+primefactor);
			if(n%i==0)
			{
				
				while(n%i==0)
				{
					n=n/i;
				}
				
				if(i>primefactor)
					primefactor=i;
				
				System.out.println("i successful; n is:"+n+"; Prime factor here is"+primefactor);
			}
		}
		
		if(n>2 && n>primefactor)
		{
			primefactor=n;
		}
		return primefactor;
	}

}
