package com.google.slidingwindow.medium;

public class LeetCode209 {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 2, 4, 3 };
		int target = 7;
		int result = minSubArrayLen(target, arr);
		System.out.println(result);
	}

	public static int minSubArrayLen(int target, int[] nums) {

		int sum = 0;
		int index = 0;
		int result = Integer.MAX_VALUE;
		int maxResult = 0;

		for (int start = 0; start < nums.length; start++) {
			sum += nums[start];

			while (sum >= target) {
				maxResult = start - index + 1;
				result = Math.min(result, maxResult);
				sum -= nums[index];
				index++;
			}
		}
		return result == Integer.MAX_VALUE ? 0 : result;

	}
}
