package com.prep.Wissen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuyMaxStocks {

	/**
	 * In a stock market, there is a product with its infinite stocks. 
	 * The stock prices are given for N days, where arr[i] denotes the 
	 * price of the stock on the ith day. There is a rule that a customer
	 *  can buy at most i stock on the ith day. If the customer has an amount 
	 *  of k amount of money initially, find out the maximum number of stocks a customer can buy.
Input : price[] = { 10, 7, 19 }, 
              k = 45.
Output : 4
A customer purchases 1 stock on day 1, 
2 stocks on day 2 and 1 stock on day 3 for 
10, 7 * 2 = 14 and 19 respectively. Hence, 
total amount is 10 + 14 + 19 = 43 and number 
of stocks purchased is 4.

Input  : price[] = { 7, 10, 4 }, 
               k = 100.x
Output : 6
	 */
	class StockPrice implements Comparator<StockPrice>
	{
		int stockDay;
		int price;
		public int compare(StockPrice a , StockPrice b) {
			if(a.price != b.price)
			return a.price - b.price ;
			else
				return a.stockDay-b.stockDay;
		}
		public int getStockDay()
		{
			return stockDay;
		}
		public int getPrice()
		{
			return price;
		}
		public String toString()
		{
			return ("stockday"+stockDay+" price"+price);
		}
	}
	int buyMaxStocks(int arr[],int size,int money)
	{
		List<StockPrice> lstPair = new ArrayList<StockPrice>();
		StockPrice pair=null;
		for(int i=0;i<size;i++)
		{
			pair = new StockPrice();
			pair.price=arr[i];
			pair.stockDay=i+1;
			lstPair.add(pair);
		}
		
		StockPrice sb = new StockPrice();
		Collections.sort(lstPair,sb);
		System.out.println(lstPair);
		
		int stockBuyCount = 0;
		
		for(int i=0;i<size;i++)
		{
			//how many possible with remaining money and with the price of stock
			int valueOfStock = money/lstPair.get(i).getPrice();
			//lstPair.get(i).getStockDay() = max stock that can be bought within a day
			stockBuyCount += Math.min(lstPair.get(i).getStockDay(), valueOfStock);			
			money -= valueOfStock * Math.min(lstPair.get(i).getStockDay(), valueOfStock);
		}
		
		return stockBuyCount;
	}
	public static void main(String[] args) {
		BuyMaxStocks bms = new BuyMaxStocks();
		int priceArr[] = {10,7,19};
		int size= priceArr.length;
		int totalMoney=45;
		System.out.println("No of stocks : "+bms.buyMaxStocks(priceArr,size,totalMoney));

	}

}
