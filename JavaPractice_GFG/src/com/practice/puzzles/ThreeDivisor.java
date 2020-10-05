package com.practice.puzzles;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ThreeDivisor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		StringBuffer sb=new StringBuffer();
		//Pre-computations for this question , calculate prime numbers upto 10^6 i.e. till
		//1000001= Math.sqrt(10^12) i.e. the upper limit of N given the question
		
		 boolean primeNo[]=new boolean[1000002];  
	      
	       for(int i=0;i<1000001;i++)
	       {
	    	   if(i%2==0)
	    		   primeNo[i]=false;
	    	   else
	    		   primeNo[i]=true;
	       }
	       
	       primeNo[1]=false;
	       primeNo[2]=true;
	       
	       for(int i=3;i<1000001;i+=2)
	       {
	    	   if(primeNo[i])
	    	   {
	    		   for(int j=2;j<=(1000001/i);j++)
	    		   {
	    			   primeNo[j*i]=false;
	    		   }
	    	   }
	       }
	    //System.out.println("Data added in the array.");
		List<Integer> lstPrimeNos=new ArrayList<Integer>();
		for(int i=0;i<1000001;i++)	
		{
			if(primeNo[i])
			{
				System.out.print(i+" ");
				lstPrimeNos.add(i);
			}
		}
		
		//System.out.println("Enter testcases now.");
		int t=sc.nextInt();
		while(t>0)
		{
			int res=0;
			long n = sc.nextLong();
			if(n>0)
			{
			//	System.out.println("Total Prime nos"+lstPrimeNos.size());
				res=countExactThreeDivisor(n,lstPrimeNos); 
			}
		     
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}
/*
 * the number theory concept that the every prime number has only two divisors one and itself and 
 * the squares of the prime numbers have only 3 divisors that is they have the exactly three divisors
 */
	
	private static int countExactThreeDivisor(long n, List<Integer> lstPrimeNos) {
		 int count3Divisor=0;
		 for(long i: lstPrimeNos)
		 {
			 if(i*i<=n)
			 {
				 count3Divisor++;
			 }
			 else
			 {
				 break;
			 }
		 }
	
       return count3Divisor;
	}


}
