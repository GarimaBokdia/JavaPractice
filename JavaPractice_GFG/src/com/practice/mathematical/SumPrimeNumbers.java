package com.practice.mathematical;

import java.util.Scanner;
/**
 * same program for printing prime nos 
 * Sieve of Eratosthenes
 * @author garijain
 *
 */
public class SumPrimeNumbers {

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
			
		    long res= calcSumPrimeNumbers(n); 
			
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}
//Implementation of sieve of eratosthene
	private static long calcSumPrimeNumbers(long n) {
		long sum=0;
		boolean primeNo[]=new boolean[(int)(n+1)];
		for(int p=0;p<primeNo.length;p++)
		{
			primeNo[p]=true;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			
			if(primeNo[i])
			{
				
				
				System.out.println("Prime no"+i);
				for(int j=i;j*i<=n;j++){
					primeNo[j*i]=false;
				}
			}
		}
		
		for(int p=0;p<primeNo.length;p++)
		{
			/* To print the prime nos
			 * if(primeNo[p]==true)
			 sb.append(p+" ");		
			 */
			if(primeNo[p]==true)
			sum=sum+p;
			System.out.println("Sum:"+sum+"; p"+p);
		}
		
		return sum;
	}

}
