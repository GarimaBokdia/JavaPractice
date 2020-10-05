package com.practice.mathematical;

import java.util.Scanner;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		
		long perm;
		while(t>0)
		{
			int n = sc.nextInt();
			//fact=calcFactorial(a1);
		    int r = sc.nextInt();
		    perm=calcPermutation(n,r);
			sb.append(perm+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static long calcFactorial(long a1) {
		
		if(a1==0 || a1==1)
		 {
		
			return 1;
		 }
		else
		 {
		
			return (a1*(calcFactorial(a1-1)))	;
		 }
	}

private static long calcPermutation(long n,long r) {
		
	   //N and R are equal or both are zero
	long op_n=1,op_d=1;
	if(r==0)
		return 1;
	
		  op_n= calcFactorial(n);
		  if(n!=r)
		   op_d= calcFactorial(n-r);
		  
		  return (op_n/op_d);
		 
	}




}
