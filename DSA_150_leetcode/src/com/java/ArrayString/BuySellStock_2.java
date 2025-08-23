package com.java.ArrayString;

public class BuySellStock_2 {

	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};
		 int maxPro= maxProfit(prices);
		 System.out.println("maxProfit : "+maxPro);

	}

	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i] > prices[i-1]) {
				maxProfit += prices[i]-prices[i-1]; 
			}
		}
		return maxProfit;
	}

}
