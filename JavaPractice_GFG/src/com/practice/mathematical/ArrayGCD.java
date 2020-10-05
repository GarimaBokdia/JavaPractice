package com.practice.mathematical;

import java.util.Scanner;

public class ArrayGCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayGCD obj = new ArrayGCD();
		Scanner sc = new Scanner(System.in);
		long t = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		long gcd = 1,gcd1=1;
		while (t > 0) {
			//count of array elements
			int a1 = sc.nextInt();
			long arr[]=new long[a1];
			for(int i=0;i<a1;i++)
			{
				long a2 = sc.nextLong();
				arr[i]=a2;
			}
			if(a1>1)
			{
				
				gcd = obj.calcGCD(arr[0], arr[1]);
				
				for(int i=2;i<a1;i++)
				{
				
					
					gcd1 = obj.calcGCD(arr[i], gcd);
					if(gcd1<gcd)
					{
						gcd=gcd1;
					}
					
					
				}
			}
			else
			{
				gcd=arr[0];
			}
			
			sb.append(gcd + "\n");	
		
			t--;
		}
		System.out.println(sb.toString());
		sc.close();
	}
	
	private long calcGCD(long a1, long a2) {
		long rem=0;
			if(a1%a2==0)
			{
				return a2;
			}
			else if(a2%a1==0)
			{
				return a1;
			}
			else if(a1>a2)
			{
				rem=a1%a2;
				return calcGCD(rem,a2);
			}
			else
			{
				rem=a2%a1;
				return calcGCD(rem,a1);
			}
			
			
		}

}
