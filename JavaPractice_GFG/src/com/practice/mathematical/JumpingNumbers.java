package com.practice.mathematical;

import java.util.*;

/**
 * Given a positive number X. Find all Jumping Numbers smaller than or equal to
 * X. Jumping Number: A number is called Jumping Number if all adjacent digits
 * in it differ by only 1. All single digit numbers are considered as Jumping
 * Numbers. For example 7, 8987 and 4343456 are Jumping numbers but 796 and
 * 89098 are not.
 * 
 * @author garijain
 * 
 */
public class JumpingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			long num = sc.nextLong();

			printJumpingNumbers(num);

			t--;
		}

		sc.close();

	}

	// Printing all jumping numbers smaller than or equal to
	// a positive number x in sorted order
	private static void printJumpingNumbers(long num) {
		StringBuilder sb = new StringBuilder();
		List<Long> op = new ArrayList<Long>();
		op.add(0L);
		for (int i = 1; i <= 9 && i <= num; i++) {
			bfs(num, i, op);
		}
		Collections.sort(op);
		for (long l : op) {
			sb.append(l + " ");
		}
		System.out.println(sb.toString());
	}

	// Prints all jumping numbers smaller than or equal to num given starting
	// with 'i'. It mainly does BFS starting from 'i'.
	public static void bfs(long num, long i, List<Long> op) {

		// Create a queue and enqueue 'i' to it
		Queue<Long> q = new LinkedList<Long>();

		q.add(i);

		// Do BFS starting from i
		while (!q.isEmpty()) {
			i = q.peek();

			q.poll();
			if (i <= num) {

				op.add((long) i);
				long last_digit = i % 10;

				// If last digit is 0, append next digit only
				if (last_digit == 0) {
					q.add((i * 10) + (last_digit + 1));
				}

				// If last digit is 9, append previous digit only
				else if (last_digit == 9) {
					q.add((i * 10) + (last_digit - 1));
				}

				// If last digit is neighter 0 nor 9, append both
				// previous and next digits
				else {
					q.add((i * 10) + (last_digit - 1));
					q.add((i * 10) + (last_digit + 1));
				}
			}
		}

	}

	/*
	 * private static void printJumpingNumbers(long num) { StringBuilder sb =
	 * new StringBuilder(); int counter = 0, x = 0, dig = 0, nextdig = 0;
	 * boolean flag = false; String snum = "";
	 * 
	 * while (counter <= num) { if (counter <= 10) { sb.append(counter + " "); }
	 * else { int i = 0; x = counter; snum = x + ""; int len = snum.length();
	 * dig = snum.charAt(i); while (len > 1) {
	 * 
	 * nextdig = snum.charAt(i + 1); len--; flag = true;
	 * 
	 * i++;
	 * 
	 * if ((Math.abs(dig - nextdig) == 1) && (flag)) { flag = true; } else {
	 * flag = false; break;
	 * 
	 * } dig = nextdig;
	 * 
	 * } if (flag == true) { sb.append(counter + " "); }
	 * 
	 * } counter++; } System.out.println(sb.toString()); }
	 */

}
