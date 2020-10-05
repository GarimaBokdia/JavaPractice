package com.practice.mathematical;

import java.util.Scanner;

public class PairsOfPrimeNos {

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
			
		    String res= printPairofPrimeNumbers(n); 
			
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static String printPairofPrimeNumbers(long n) {
		StringBuilder sb = new StringBuilder();
		boolean primeNo[]=new boolean[(int)(n+1)];
		for(int i=0;i<=n;i++)
		{
			primeNo[i]=true;
		}
		for(int p=2;p<=Math.sqrt(n);p++)
		{
			if(primeNo[p])
			{
				for(int j=p;j*p<=n;j++)
				{
					primeNo[j*p]=false;
				}
			}
		}
		
		for(int k=2;k<primeNo.length;k++)
		{
			if(primeNo[k])
			{
				for(int l=2;l<primeNo.length;l++)
				{
					if(primeNo[l] && k*l<=n)
					{
						sb.append(k+" "+l+" ");
					}
				}
			}
		}
		return sb.toString();
	}

}
