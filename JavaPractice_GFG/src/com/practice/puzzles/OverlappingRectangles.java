package com.practice.puzzles;

import java.util.Scanner;

/*
 * Given two rectangles, find if the given two rectangles overlap or not. 
 * A rectangle is denoted by providing the x and y co-ordinates of two points: the left top 
 * corner and the right bottom corner of the rectangle. Two rectangles sharing a side are considered overlapping
 */
public class OverlappingRectangles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			int res=1;
			//Pt1 L1
			int r1lx = sc.nextInt();
			int r1ly = sc.nextInt();
			//Pt2 R1
			int r1rx = sc.nextInt();
			int r1ry = sc.nextInt();
			//Pt3 L2
			int r2lx = sc.nextInt();
			int r2ly = sc.nextInt();
			//Pt4 R2
			int r2rx = sc.nextInt();					
			int r2ry = sc.nextInt();
			
			if((r1rx<r2lx || r2rx<r1lx))
			{
				res=0;
			}
			else if((r1ry>r2ly || r2ry>r1ly))
			{
				res=0;	
			}
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

}
