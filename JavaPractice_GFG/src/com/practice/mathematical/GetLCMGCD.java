package com.practice.mathematical;

import java.util.Scanner;

public class GetLCMGCD {

	/**
	 * An efficient solution is based on below formula for LCM of two numbers ‘a’ and ‘b’.

   a x b = LCM(a, b) * GCD (a, b)

   LCM(a, b) = (a x b) / GCD(a, b) 
	 */

	public static void main(String[] args) {
		GetLCMGCD obj = new GetLCMGCD();
		Scanner sc = new Scanner(System.in);
		long t = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		long gcd = 1,lcm=1;
		while (t > 0) {
			long a1 = sc.nextInt();
			long a2 = sc.nextInt();
			if (a1 > 1 && a2 > 1)
			{
				gcd = obj.calcGCD(a1, a2);
				
			}
			if (a1 > 1 && a2 > 1)
			{
				lcm=(a1*a2)/gcd;	
				sb.append(lcm + " ");
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

	//Time is more than 0 sec
	/*private long calcGCD(long a1, long a2) {
		long gcd = 1;
		long mul = 2;

		while (a1 > 1 && a2 > 1) {
			if ((a1 < 10 && a2 < 10)
					&& ((a1 % 2 == 0 && a2 % 2 != 0) || (a1 % 2 != 0 && a2 % 2 == 0))) {
				break;
			}
			if (a1 % mul == 0 && a2 % mul == 0) {
				gcd = gcd * mul;
				a1 = a1 / mul;
				a2 = a2 / mul;
			} else {
				mul = mul + 1;

			}
		}
		return gcd;
	}*/
	
	

}
