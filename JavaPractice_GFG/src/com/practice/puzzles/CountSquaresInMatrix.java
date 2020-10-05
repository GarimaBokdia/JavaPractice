package com.practice.puzzles;

import java.util.Scanner;

public class CountSquaresInMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			int m_row = sc.nextInt();
			int n_col = sc.nextInt();
			
		    long countSquares= calcNumSquareInMatrix(m_row,n_col); 
			
			sb.append(countSquares+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}

	private static long calcNumSquareInMatrix(int m_row,int n_col)
	{
		long count=0;
		while(m_row>0 && n_col>0)
		{
			count=count+(m_row*n_col);
			m_row--;
			n_col--;
		}
		return count;		
	}
}
