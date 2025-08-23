package com.java.Arrays;

public class Best_Time_to_Buy_and_Sell {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int maxProfit = bestTimeToBuyAndSell(prices);
		System.out.println("maxProfit :"+maxProfit);
	}

	private static int bestTimeToBuyAndSell(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		System.out.println(minPrice);
		int maxProfit = 0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<minPrice) {
				minPrice = prices[i];
			}else if(prices[i]-minPrice>maxProfit) {
				maxProfit = prices[i]-minPrice;
			}
		}
		
		
		return maxProfit;
	}

	
	
	

}
