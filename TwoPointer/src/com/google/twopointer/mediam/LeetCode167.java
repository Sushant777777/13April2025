package com.google.twopointer.mediam;

public class LeetCode167 {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4 };
		int target = 6;
		int result[] = twoSum(arr, target);
		System.out.println(result);
	}

	public static int[] twoSum(int[] nums, int target) {

		int l = 0, r = nums.length - 1;

		while (nums[l] + nums[r] != target) {
			if (nums[l] + nums[r] < target)
				l++;
			else
				r--;
		}

		return new int[] { l + 1, r + 1 };

	}
}
