package com.practice.mathematical;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of testcase");
		int t = sc.nextInt();
		while (t > 0) {
			System.out.println("Enter no");
			int n = sc.nextInt();
			GFG g = new GFG();
			g.printPat(n);
			System.out.println();
			t--;
		}
	}
}

class GFG {

	public void printPat(int n) {

	     StringBuilder sb=new StringBuilder();
	       for (int i = n; i > 0; i--) {

				for (int k = n; k > 0; k--) {
					int j = 0;
					while (j < i) {
						sb.append(k+" ");
						j++;
					}

				}

				sb.append("$");
			}
	    System.out.print(sb.toString());

	}

}