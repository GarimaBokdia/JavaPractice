package com.practice.puzzles;

import java.util.Scanner;

public class DayOfWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(t>0)
		{
			int d = sc.nextInt();
			int m = sc.nextInt();
			int y = sc.nextInt();
		    String day= calcDayOfWeek(d,m,y); 
			
			sb.append(day+"\n");

			t--;
		}
		System.out.println(sb.toString());
	sc.close();
	}
	
	private static String calcDayOfWeek(double d, double m, double y) {
		/*
		 (Year Code + Month Code + Century Code + Date Number – Leap Year Code) mod 7
		 If the date is in a January or February of a leap year, you have to subtract
		 one from your total before the final step.
		 */
		int monthcode[]={0,3,3,6,1,4,6,2,5,0,3,5};
		//in code given that range is 1990 to 2100 (1700 - 2300 is 4206420)
		int centuryCode[]={0,6,4};
		//The year code = (YY + (YY div 4)) mod 7 ; YY is last 2 digit of th given year
		double YY=y%100;
		System.out.println("YY "+YY);
		//Take value in long variable as we need mod value in full integer
	    long yearCode = (long)(YY + (YY/4));
	    yearCode = yearCode%7;
	    /*
	     * The other thing to take into account is whether you are dealing with a leap year.
	     *  EDIT: If the date is in a January or February of a leap year, 
	     *  you have to subtract one from your total before the final step.
	     */
	    int leapYearCode=0;
	    if(m==1 || m==2)
	    {
	    	if(y%400 ==0)
		    {
		    	leapYearCode=1;
		    }
		    else
		    {
		    	if(y%4==0)
		    	{
		    		leapYearCode=1;
		    	}
		    }
	    }
	    int centuryIndex=0;
	    int yearIndex=(int) (y/100);
	    System.out.println("yearIndex "+yearIndex);
	    if(yearIndex==19)
	    {
	    	centuryIndex=0;
	    	
	    }
	    else if(yearIndex==20)
	    {
	    	centuryIndex=1;
	    	
	    }
	    else if(yearIndex==21)
	    {
	    	centuryIndex=2;
	    }
	    System.out.println("yearCode:"+yearCode+"; monthcode[(int) (m-1)] :"+monthcode[(int) (m-1)]+"; centuryCode[centuryIndex]:" +centuryCode[centuryIndex]+"; d:"+d +"; leapYearCode"+leapYearCode   );
	    double op= yearCode+monthcode[(int) (m-1)]+centuryCode[centuryIndex]+ d -leapYearCode;
	    
		
	 op=Math.abs(op%7);
	String day="";	
		if(op==1)
			day="Monday";
		else if(op==2)
		day="Tuesday";
		else if(op==3)
			day="Wednesday";
		else if(op==4)
			day="Thursday";
		else if(op==5)
			day="Friday";
		else if(op==6)
			day="Saturday";
		else
			day="Sunday";
		
		return day;
	}

}
