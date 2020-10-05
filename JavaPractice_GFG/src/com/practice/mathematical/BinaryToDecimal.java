package com.practice.mathematical;

import java.util.Scanner;

public class BinaryToDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (t > 0) {
			long num = sc.nextLong();

			long revNum = printBinaryNumber(num);
			sb.append(revNum + "\n");
			t--;
		}
		System.out.println(sb.toString());
		sc.close();

	}

	private static long printBinaryNumber(long num) {
		long dig = 0, counter = 0;
		double sum = 0;
		while (num > 0) {

			if (num != 1)
				dig = (num % 10);
			else
				dig = 1;

			sum = sum + dig * Math.pow(2, counter);

			counter++;
			num = num / 10;

		}

		return (long) sum;
	}

}
