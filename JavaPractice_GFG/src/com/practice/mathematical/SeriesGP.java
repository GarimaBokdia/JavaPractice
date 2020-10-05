package com.practice.mathematical;

/*package whatever //do not write package name here */

import java.util.*;

class SeriesGP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (t > 0) {
			double a1 = sc.nextDouble();
			double a2 = sc.nextDouble();
			int n = sc.nextInt();
			int counter = n - 1;
			double nth = 0;
			double r;
			if (a1 != 0) {
				
				r = a2 / a1;
				nth = a1;
				while (counter > 0) {
					nth = nth * r;
					counter--;
				}
				
				nth=Math.floor(nth);
		
				
			}
			sb.append((int)nth + "\n");

			t--;
		}
		System.out.println(sb.toString());
		sc.close();
	}

}