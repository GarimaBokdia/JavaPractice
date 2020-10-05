package com.practice.mathematical;

import java.util.Scanner;
/*
 * Understood the concept form below link:
 * https://www.youtube.com/watch?v=HQdTcnOy0Bo
 */
/*
 * We can use distributive property of modulor operator to find nCr % p using above formula.
C(n, r)%p = [ C(n-1, r-1)%p + C(n-1, r)%p ] % p
C(n, 0) = C(n, n) = 1
The above formula can implemented using Dynamic Programming using a 2D array.
Working on the basis of pascals triangle
 */
public class CombinationNcR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		
		double comb = 0;
		while(t>0)
		{
			int n = sc.nextInt();
			//fact=calcFactorial(a1);
		    int r = sc.nextInt();
		    
		    double p = Math.pow(10, 9)+7;
		    if(r<n)
		    {
		    	comb=calcCombination(n,r,p);
		    }
		  
			sb.append((long)comb+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static double calcCombination(int n, int r, double p) {
		//creating 2D array to store the values calculated for a each n-r column
		double mnrc[][]=new double[n+1][n+1];
		
		
		for(int i=0;i<=n;i++)
		{
			mnrc[i][0]=1;			
		}
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=Math.min(i, r);j++)
			{
			
				mnrc[i][j]=(mnrc[i-1][j-1]+mnrc[i-1][j])%p;
				if(i==n && j==r)
					break;
			}
		}
		
		
	
		return mnrc[n][r];
	}

}
