package com.prep.Wissen;

import java.util.ArrayList;

public class StockBuySellMaxProfit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StockBuySellMaxProfit sbs = new StockBuySellMaxProfit();
		  // stock prices on consecutive days 
		int price[] ={7,1,5,3,6,4};
			//{ 1, 5, 2, 3, 7, 6, 4, 5 };
			//{ 100, 180, 260, 310, 40, 535, 695 }; 
        int n = price.length; 
         // function call 
        sbs.stockBuySell(price, n); 
	}
	class StockDay
	{
		int buyDay;
		int sellDay;
		int profit;
	}
	public void stockBuySell(int arr[],int n)
	{
		 // Prices must be given for at least two days 
		if(n==1)
			return;
		//Solution array details
		int transCount=0;		
		ArrayList<StockDay> solArr = new ArrayList<StockDay>();
		
		//Traversing through price array to determine solution
		int i=0;
		while(i<n-1)
		{
			// Find Local Minima day. Note that the limit is (n-2) as we are 
	        // comparing present element to the next element. 
			 while(i<n-1 && arr[i+1]<=arr[i])
			 {
				 i++;
			 }
			 //we have reached till last element i.e. no further solution possible
			 if(i==n-1)
			 {
				return;
			 }			
			StockDay sd=new StockDay();
			// Store the index of minima 
			sd.buyDay=i++;
		
			// Find Local Maxima day.  Note that the limit is (n-1) as we are 
	        // comparing to previous element 
			while(i<n && arr[i]>=arr[i-1])
			{
				i++;
			}
			// Store the index of maxima 
			sd.sellDay=i-1;
			
			//proft
			sd.profit = arr[sd.sellDay]-arr[sd.buyDay];
			// Update transaction details 
			solArr.add(sd);
			transCount++;
		}
		
		if(transCount==0)
		{
			System.out.println("No Days good for transaction");
		}
		else
		{
			int totalProfit=0;
			for(StockDay sday : solArr)
			{
				totalProfit+=sday.profit;
				System.out.println("Buy on day "+(sday.buyDay+1)+"; Sell on day "+(sday.sellDay+1)+" with profit "+sday.profit);
			}
			System.out.println("Total Profit "+totalProfit);
		}
		return;
	}
}
