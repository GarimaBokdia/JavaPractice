package com.practice.puzzles;

import java.util.Scanner;

public class NthEvenFibonacci {

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
			
		    long res= printNthEvenFibonacciNumber(n); 
			
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static long printNthEvenFibonacciNumber(long nth) {
		long n1=1,n2=1;
		int count =0;
		long nextFibNum=0;
		long iter=0;
		//every 3rd fibonacci number is even
		//in first iteration , fibNum is 2 and 0%3 ==0 is true and even counter increases
		while(count!=nth)
		{
			System.out.print("Iter is "+iter+" ;");
			nextFibNum=(n1+n2)%1000000007;	
			System.out.print(nextFibNum+"  ");
			n1=n2;
			n2=nextFibNum;
			if(iter%3==0)
			{
				System.out.println("Even : "+nextFibNum+"  ");
				count++;
			}
			iter++;
		}
  	   
		
		return nextFibNum%1000000007;
	}

	
			


}
