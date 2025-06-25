package com.google.easy;

public class LeetCode26 {
	public static void main(String[] args) {
		int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int result = removeDuplicates(nums);
		System.out.println(result);
	}

	public static int removeDuplicates(int[] nums) {
		int start = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[start] = nums[i];
				start++;
			}
		}
		return start;
	}
}
