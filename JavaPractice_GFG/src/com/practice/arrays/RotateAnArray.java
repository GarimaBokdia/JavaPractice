package com.practice.arrays;

import java.util.Scanner;

public class RotateAnArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		StringBuffer pre=null,post=null;
		int t=sc.nextInt();
		
		while(t>0)
		{
						
			 pre=new StringBuffer();
			 post=new StringBuffer();
			int n = sc.nextInt();
			int d = sc.nextInt();
			int a[]=new int[n];
			int rotatedArr[]=new int[n];
			int j=0; //index for rotated array
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				if(i>=d)
				{
					rotatedArr[j]=a[i];
					pre=pre.append(rotatedArr[j]+" ");
					j++;
				}	
				else
				{
				
					rotatedArr[((n-d)+ i)]=a[i];
					post=post.append(rotatedArr[(n-d)+i]+" ");
				}
				
			}
		
			
		    sb.append(pre);
		    sb.append(post+"\n");
		   	
			t--;
		}
	System.out.print(sb.toString());
	sc.close();
	
	}

}
