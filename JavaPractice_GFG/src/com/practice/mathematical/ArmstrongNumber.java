package com.practice.mathematical;

import java.util.Scanner;

/*
 * For a given 3 digit number, find whether it is armstrong number or not.
 *  An Armstrong number of three digits is an integer such that the sum of the cubes of 
 *  its digits is equal to * the number itself.
 *   For example, 371 is an Armstrong number since 
 *   33 + 73 + 13 = 371
 */
public class ArmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (t > 0) {
			
		 int num=sc.nextInt();
		 int inp=num;
		 int dig=0;
		 double sum=0;
		 for (int i=0;i<3;i++)
		 {
			 dig=num%10;
			 num=num/10;
			 sum= sum+ Math.pow(dig, 3);
		 }
				
			if(sum==inp)
				sb.append("Yes\n");
			else
				sb.append("No\n");
			t--;
		}
		System.out.println(sb.toString());
		sc.close();

	}

}
