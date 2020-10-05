package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlternatePrint {


		/**
		 * @param args
		 */
		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t>0)
			{
				int n = sc.nextInt();
				int a[]=new int[n];
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
				}
			
			   print(a,n);

				t--;
			}
			System.out.println();
		sc.close();
		
		}
		
		
		public static void print(int arr[], int n)
		{
		     StringBuffer sb= new StringBuffer();
		for(long i=0;i<n;i=i+2)
		{
		   sb.append(arr[(int)i]+" ");
		}
		System.out.println(sb.toString());
		}

}



