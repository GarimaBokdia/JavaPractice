package com.practice.mathematical;

import java.util.Scanner;
/*
 * Given N, count all ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a3 + b3 = N.
 */
public class PairCubeCount {

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
			
		    int res= countPairCubeNumbers(a1); 
			
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static int countPairCubeNumbers(long n) {
		int count=0;
		double sum=0;
		for(int i=1;i<=Math.cbrt(n);i++)
		{
			for(int j=0;j<=Math.cbrt(n);j++)
			{
			 sum= Math.pow(i, 3) + Math.pow(j, 3);
			 if(sum==n)
				 count++;
			}
		}
		return count;
	}

}
