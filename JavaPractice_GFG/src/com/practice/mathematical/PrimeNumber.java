package com.practice.mathematical;

import java.util.Scanner;

public class PrimeNumber {

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
			
		    String res= isPrimeNumber(n); 
			
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static String isPrimeNumber(long n) {
		String res="Yes";
		for(long i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				res="No";
				break;
			}
		}
		return res;
	}

}
