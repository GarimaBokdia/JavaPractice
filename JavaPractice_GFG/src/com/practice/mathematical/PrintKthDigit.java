package com.practice.mathematical;

import java.util.Scanner;

public class PrintKthDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (t > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();
			int kth = printKthDigit(a,b,k);
			sb.append(kth+"\n");
			t--;
		}
		System.out.println(sb.toString());
		sc.close();

	}

	private static int printKthDigit(int a, int b, int k) {
		int counter=0;
		double dig=0;
		double ab=Math.pow(a, b);
		while(ab>0 && counter!=k)
		{
			dig=ab%10;
			ab=ab/10;
			counter++;
			
		}
		return (int)dig;
	}

}
