package com.practice.puzzles;

import java.util.Scanner;

public class Last2DigFibSeries {

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
		
		    String res= printLastTwoDigitFibonacciNumber(n); 
			
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static String printLastTwoDigitFibonacciNumber(long n) {
		int arrLast2Digit[]=new int[300];
		arrLast2Digit[0]=0;
		arrLast2Digit[1]=1;
		String out="";
		for(int i=2;i<300;i++)
		{
			/**
			 * Store last 2 digits of a fib number in an array,so that it can be printed
			 */
			arrLast2Digit[i]=(arrLast2Digit[i-1]+arrLast2Digit[i-2])%100;
		}
		/*
		 * Last 2 digits of a fibonacci series repeats after 300th number, so just take a mod value
		 * and numbering will start ending again with the number stored in above array.
		 */
		int printLoc=(int) (n%300);
		      
	
		if(arrLast2Digit[printLoc]<10)
			out="0"+arrLast2Digit[printLoc];
		else
			out=arrLast2Digit[printLoc]+"";
		return out;
	}

}
