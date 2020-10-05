package com.practice.arrays;

import java.util.Scanner;

public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		int t=sc.nextInt();
		String res="";
		while(t>0)
		{
			res="";			
			int n = sc.nextInt();
			int a[]=new int[n];
			int revArr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				revArr[(n-1)-i]=a[i];
			}
			for(int i=0;i<n;i++)
			{
				res=res+revArr[i]+" ";
			}
		    
		   	sb.append(res+"\n");
			t--;
		}
		System.out.print(sb.toString());
	sc.close();
	
	}

}
