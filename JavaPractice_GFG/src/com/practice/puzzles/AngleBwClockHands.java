package com.practice.puzzles;

import java.util.Scanner;

public class AngleBwClockHands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			double hh = sc.nextDouble();
			double mm = sc.nextDouble();
		    double res = calcAngle(hh,mm); 
			
			sb.append((int)res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static double calcAngle(double hh, double mm) {
		double angle=0;
		double hour;
		double min=mm*6; //given minutes and angle from 12
		if(mm!=60)
		{
			hour=hh+(mm/60);	
		}
		else
		{
			hour=hh;
		}
		System.out.println("hour"+hour);
		hour=hour*30;
		
		angle=(Math.abs(hour-min));
		
		if(angle>180)
		{
			angle=360-angle;
		}
		angle=Math.floor(angle);
		return angle;
	}

}
