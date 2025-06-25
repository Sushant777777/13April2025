package com.google.easy;

import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {
	public static void main(String[] args) {
		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		int result = majorityElement(nums);
		System.out.println(result);
	}

	public static int majorityElement(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		n = n / 2;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > n) {
				return entry.getKey();
			}
		}

		return 0;
	}
}
