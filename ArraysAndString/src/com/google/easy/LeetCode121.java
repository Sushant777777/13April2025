package com.google.easy;

public class LeetCode121 {
	public static void main(String[] args) {
		int nums[] = { 2, 1, 2, 1, 0, 0, 1 };
		int result = maxProfit(nums);
		System.out.println(result);
	}

	public static int maxProfit(int[] prices) {
		int firstDay = prices[0];

		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (firstDay > prices[i]) {
				firstDay = prices[i];
			} else {
				maxProfit = Math.max(prices[i] - firstDay, maxProfit);
			}
		}
		return maxProfit;
	}
}
