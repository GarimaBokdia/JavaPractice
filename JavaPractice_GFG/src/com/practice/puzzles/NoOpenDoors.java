package com.practice.puzzles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 1) the number of doors that have odd number of factors remain open.
2) only perfect squares have odd number of factors.
 */
public class NoOpenDoors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			long n = sc.nextLong();
			
		    long res= countNoOfOpenDoors(n); 
			
			sb.append(res+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}
	/*
	 * Only perfect squares have an odd number of factors.This is because a*b=n. 
	 * For any number a there is a corresponding number b which is also a factor 
	 * hence factors will make pairs always.But when it is perfect square 
	 * then a*a=n where a is sqrt(n).
	 * Due to of presence of this single factor whose pair is itself
	 *  will make total number of factors odd. Hence only perfect square will 
	 *  have odd number of factors.
	 */
	private static long countNoOfOpenDoors(long n) {
		//First go all doors are open i.e. 1,2,3,4,5,..n
		//Second go close doors              2 , 4 , ..
		//third go close doors                 3      ..
		//4th.                                    4   ..      
		//5th                                       5
		//open door will be O,OCO,OCOCO etc.. this is happening for perfect squares
		//so we can calculate numbers having perfect square less than equal to N
		
		/**
		 * Below is solution referred from GFG; taking square root i.e.
		 * we can observe in above decription that 1 and 4 had odd number of factors
		 * i.e for 1(1) and 4(1,2,4) and only perfect squares have odd number of factors
		 */
		//long noOfDoor=(long)Math.sqrt(n);
		long noOfDoor=0;
		for(long i=1;i*i<=n;i++)
		{
			noOfDoor++;
		}
		return noOfDoor;
	}
    //Heap Error
	/*private static long countNoOfOpenDoors(long n) {
		//First go all doors are open i.e. 1,2,3..n
		long counter=1;
		int noOfDoor=0;
		List<Boolean> arrDoor=new ArrayList<Boolean>();
		for(int i=0;i<=n;i++)
		{
			arrDoor.add(true);
		}
		counter=2;
		while(counter<=n)
		{
			
			long i=1;
			long doorIndex=counter*i;
			while(doorIndex<=n)
			{
							
				if(!arrDoor.get((int) doorIndex))
				   arrDoor.set((int) doorIndex,true);
				else 
					arrDoor.set((int) doorIndex,false);
				i++;
				doorIndex=counter*i;
			}
			counter++;
		}
		
		for(int i=1;i<=n;i++)
		{
			if(arrDoor.get((int) i))
				noOfDoor++;
		}
		return noOfDoor;
	}*/

}
