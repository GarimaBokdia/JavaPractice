package com.practice.arrays;


import java.util.Arrays;
import java.util.Scanner;


public class ArrayOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			int n = sc.nextInt();
			int[] a = new int[10000];
			Arrays.fill(a, -1);
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int x=sc.nextInt();
			int y=sc.nextInt();
			int yi=sc.nextInt();
			int z=sc.nextInt();
			
		    GFG g=new GFG();
		//	System.out.println("Search element");
			boolean res = g.searchEle(a, x);
			sb.append(res+" ");
		//	System.out.println("Insert element");
			boolean res1 = g.insertEle(a,y,yi);
			
			 sb.append(res1+" ");
		//	System.out.println("Delete element");
			 boolean res2 = g.deleteEle(a, z);
			 sb.append(res2+" ");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	
	}
}
class GFG{
	public boolean searchEle(int a[],int x)
    {
		for(int i=0;i<a.length && a[i]!= -1;i++)
		{
		    if(a[i]==x)
		    {
		        return true;
		    }
		   
		}
		return false;
	}
	public boolean insertEle(int a[],int y,int yi)
     {
		
         int aOldLength=a.length;
         Integer[] boxedArray = new Integer[aOldLength];
         Arrays.fill(boxedArray,-1);
         for(int i=0;i<aOldLength && a[i]!=-1;i++)
         {
        	 boxedArray[i]=Integer.valueOf(a[i]);
         }
         java.util.List<Integer> aList = new java.util.ArrayList<Integer>(Arrays.asList(boxedArray));
        aList.add(yi,y);
        boxedArray = (Integer[]) aList.toArray(boxedArray);
        for(int i=0;i<aOldLength && boxedArray[i]!=-1;i++)
        {
       	 a[i]=boxedArray[i];
        }
        return true;
     }
	public boolean deleteEle(int a[],int z)
 {
     //place to do replacement
     boolean swap = false;
	    for(int i=0;i<a.length && a[i]!= -1;i++)
	    {
	        if(a[i]==z)
	       {
	          swap=true;
	       }
	        if(swap)
	        {
	        	a[i]=a[i+1];
	        }
	    }
	    
	    return swap;
	}
	
	
}


