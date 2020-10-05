package com.practice.mathematical;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NthRootM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			int n = sc.nextInt();
			double m = sc.nextDouble();
			
			int root = printNthRootM(n,m);
			sb.append(root+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static int printNthRootM(float n, double m) {
		//nth root of m
		//for eg square root of 16 = square of 4
		//Find X,  nth  root of m  = n power of 'X'
		int root=-1;
		DecimalFormat df = new DecimalFormat("#.###");
		double power=(1/n);
		
		System.out.println("power: "+power);
		double res = Math.pow(m,power);
		
		String sres=df.format(res);
		res= Double.parseDouble(sres);
		System.out.println("Root: "+res);
		int res_i=(int)res;
		if(res ==res_i)
		{
			root=res_i;
		}
		
		return root;
	}

}
