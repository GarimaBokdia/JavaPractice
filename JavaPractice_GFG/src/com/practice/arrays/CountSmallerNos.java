package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountSmallerNos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		int t=sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();			
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
			}
			int x = sc.nextInt();	
			Arrays.sort(a);
			int counter=0;
			//If last element is smaller than or equal to pivot element then all counter = n i.e. all elements are smaller
			if(a[n-1]<=x)
			{
				counter=n;
			}
			else if(a[0]>x) //If first element is bigger than  pivot element then all counter = 0 i.e. all elements are bigger
			{
				counter=0;
			}
			else
			{
			    for(int i=0;i<n;i++)
			    {
			    	if(a[i]>x)
			    	{
			    		counter=i;
			    		break;
			    	}
			    }
			}
		    sb.append(counter+"\n");
		   	
			t--;
		}
	System.out.print(sb.toString());
	sc.close();
	
	}

}
