package com.practice.mathematical;

import java.util.Scanner;

public class ReverseDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (t > 0) {
			long num = sc.nextLong();
			
			long revNum = printReverseDigit(num);
			sb.append(revNum+"\n");
			t--;
		}
		System.out.println(sb.toString());
		sc.close();

	}

	private static long printReverseDigit(long num) {
		long revNum=0,dig=0;
		
		long divisor=1;
		System.out.println("Num ##"+num);
		while(num/divisor>=10)
		{
			divisor=divisor*10;
		}
		System.out.println("Divisor @@"+divisor);
		
		while(num>0)
		{
			dig=num%10;
			revNum=revNum+(dig*divisor);
			num=num/10;
			
			divisor=divisor/10;
			System.out.println("Dig : "+dig + "; RevNum : "+revNum+"; num : "+num+"; divisor: "+divisor);
		}
		System.out.println("\n\n RevNum ##"+revNum);
		return revNum;
	}

}
