package com.practice.mathematical;

import java.util.Scanner;

public class SumFraction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SumFraction obj = new SumFraction();
		Scanner sc = new Scanner(System.in);
		long t = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		
		while (t > 0) {
			int n1 = sc.nextInt();
			int d1 = sc.nextInt();
			int n2 = sc.nextInt();
			int d2 = sc.nextInt();
			
			String op= obj.calcFractionSum(n1,d1,n2,d2);
					
			sb.append(op+"\n");	
		
			t--;
		}
		System.out.println(sb.toString());
		sc.close();
	}
  
	public String calcFractionSum(int num1,int den1,int num2,int den2)
	{
		String op="";
		double op_n=0,op_d=0;
		/*double rem=1;
		double sum=0;
		if(den1==den2)
		{
			op_d=den1;
		}
		else if(den1>den2 && den1%den2==0)
		{
			op_d=den1;
		}
		else if(den1<den2 && den2%den1==0)
		{
			op_d=den2;
		}
		if(op_d!=0)
		{
			if(den1<op_d)
			{
				rem=op_d/den1;
				op_n=rem*num1+num2;
			}
			else
			{
				rem=op_d/den2;
				op_n=num1+rem*num2;
			}
		}
		else
		{*/
			 op_n=num1*den2+num2*den1;
			    op_d=den1*den2;
			   double gcd = findCommonFactor(op_n,op_d);
			   op_n=op_n/gcd;
			   op_d=op_d/gcd;	
		/*}*/
		
	   
	   op=(long)op_n+"/"+(long)op_d;
		return op;
	}

	public double findCommonFactor(double op_n, double op_d) {
		if(op_n%op_d==0)
		{
			return op_d;
		}
		else if(op_d%op_n==0)
		{
			return op_n;
		}
		else if(op_n>op_d)
		{
			return findCommonFactor(op_n%op_d, op_d);
		}
		else
		{
			return findCommonFactor(op_d%op_n, op_n);
		}
		
	}
}
