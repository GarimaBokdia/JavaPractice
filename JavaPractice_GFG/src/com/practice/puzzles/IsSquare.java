package com.practice.puzzles;

import java.util.Scanner;


public class IsSquare {

	/**
	 * Distance Between Two Points (x â‚�, yâ‚�) and (xâ‚‚ , yâ‚‚)
âˆš(xâ‚‚-xâ‚�)Â² + (yâ‚‚-yâ‚�)Â²
For square check if the distance between all points for 4 sides i.e. d
and check the length of 2 diagonal which should be âˆš2*d
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			String res="No";
			//Pt1
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			//Pt2
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			//Pt3
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			//Pt4
			int x4 = sc.nextInt();					
			int y4 = sc.nextInt();
			
			double d12_sq = calcDistancePoints(x1,y1,x2,y2);
			double d13_sq = calcDistancePoints(x1,y1,x3,y3);
			double d14_sq = calcDistancePoints(x1,y1,x4,y4);
			System.out.println("d12: "+d12_sq+"; d13:"+d13_sq+"; d14:"+d14_sq);
			
			if(d12_sq>0 && d13_sq>0 && d14_sq>0)
			{
				if(d12_sq==d13_sq) //these are 2 sides of square so d14 will be checked diagonal
				{
					double diag= (d12_sq)+(d13_sq);
					if(d14_sq==diag)
					{
						res="Yes";
					}
					
				}
				else if(d12_sq==d14_sq)
				{
					double diag= (d12_sq)+(d14_sq);
					if(d13_sq==diag)
					{
						res="Yes";
					}
					
				}
				else if(d13_sq==d14_sq)
				{
					double diag= (d13_sq)+(d14_sq);
					if(d12_sq==diag)
					{
						res="Yes";
					}
					
				}
				
			}
			
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static double calcDistancePoints(int px1, int py1, int px2, int py2) {
		double dist = (px2-px1)*(px2-px1) + (py2-py1)*(py2-py1);	
		return dist;
	}

}
