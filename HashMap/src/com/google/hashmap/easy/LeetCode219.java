package com.google.hashmap.easy;

import java.util.HashMap;

public class LeetCode219 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 2, 3 };
		int k = 2;
		boolean containsNearbyDuplicate = containsNearbyDuplicate(arr, k);
		System.out.println(containsNearbyDuplicate);
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!hashMap.containsKey(nums[i])) {
				hashMap.put(nums[i], i);
			} else {
				int val = hashMap.get(nums[i]);
				int result = i - val;
				if (result <= k)
					return true;
				else
					hashMap.put(nums[i], i);
			}
		}

		return false;

	}
}
