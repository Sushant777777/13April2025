package com.google.hashmap.easy;

import java.util.HashMap;

public class LeetCode1 {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] twoSum = twoSum(nums, target);
	}

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];

			if (hashMap.containsKey(complement)) {
				return new int[] { hashMap.get(complement), i };
			}

			hashMap.put(nums[i], i);
		}
		return nums;

	}
}
