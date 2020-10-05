package com.practice.mathematical;
/*package whatever //do not write package name here */

import java.util.*;

class SeriesAP {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int n = sc.nextInt();
			int nth = a1+(n-1)*(a2-a1);
			sb.append(nth+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}
	

}