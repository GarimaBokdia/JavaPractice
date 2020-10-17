package com.practice.dynamicProgramming;

public class Fibbonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 2;
		
		System.out.println(fib(N));

	}
	
	  public static int fib(int N) {
	        int[] fib=new int[N+2];
	        fib[0]=0;
	        fib[1]=1;
	        for(int i=2;i<=N;i++)
	        {
	            fib[i]=fib[i-1]+fib[i-2];
	        }
	        
	        return fib[N];
	    }

}
