package com.practice.puzzles;

import java.util.Scanner;

public class TrailingZeroFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			int n = sc.nextInt();
			
		    long res= calcTrailingZeroInFactorial(n); 
			
			sb.append(res+"\n"); 

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}
	
	private static long calcTrailingZeroInFactorial(int n) {
		long count=0;
		double div=5;
		while(div<=n)
		{
			count= (long) (count + (n/div));
			div=div*5;
		}
		
		return count;
	}

	/*private static int calcTrailingZeroInFactorial(long n) {
		int count=0;
		long fact=factorial(n);
		System.out.println("Factorial is "+fact);
		while(fact%10==0)
		{
			++count;
			fact=fact/10;
		
		}
		return count;
	}*/

	/*private static long factorial(long n) {
		System.out.println("N is:"+n);
		if(n==0 || n==1)
			return 1;
		else
		return (n*factorial(n-1));
		
	}*/

}
