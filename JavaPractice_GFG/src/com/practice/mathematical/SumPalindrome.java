package com.practice.mathematical;

import java.util.Scanner;

/**
 * Write a program to check if the sum of digits of a given number N is a
 * palindrome number or not.
 * 
 * @author garijain
 * 
 */
public class SumPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (t > 0) {
			int num = sc.nextInt();
			
			String result = checkSumPalindrome(num);
			sb.append(result);
			t--;
		}
		System.out.println(sb.toString());
		sc.close();

	}

	private static String checkSumPalindrome(int num) {
		//To check if number is palindrome or not
		int pal=num;
		int n = num;
		String result=null;
		int dig = 0, sum = 0;
		// check if sum is palindrome or not
		int divisor = 1;
		int trailing, leading = 0;
		// get the sum of digits
		while (num > 0) {
			dig = num % 10;
			sum = sum + dig;
			num = num / 10;
		}
		n = sum;
		System.out.println("Sum"+sum);
		n=pal;
		System.out.println("Pal"+pal);
		//Finding correct divisor for the digit
		while (n / divisor >= 10)
			divisor = divisor * 10;	
		System.out.println("divisor"+divisor);
		while (n > 0) {
			trailing = n % 10;
			leading = n / divisor;

			System.out.println("leading"+leading);
			System.out.println("trailing"+trailing);
			if (trailing != leading) {
				result="No\n";
				return result;
			} else {
				n = (n % divisor) / 10;
				divisor = divisor / 100;
			}
			System.out.println("leading after n "+n);
			System.out.println("trailing after divisor"+divisor);
	
		}
		
		result="Yes\n";
		return result;
	}

}
