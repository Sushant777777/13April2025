package com.google.easy;

public class LeetCode27 {
	public static void main(String[] args) {
		int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int result = removeElement(nums, val);
		System.out.println(result);
	}

	public static int removeElement(int[] nums, int val) {
		int indexSize = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[indexSize] = nums[i];
				indexSize++;
			}

		}

		return indexSize;

	}
}
