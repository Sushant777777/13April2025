package com.google.mediam;

public class LeetCode55 {

	public static void main(String[] args) {
		int nums[] = { 3, 2, 1, 0, 4 };
		boolean result = canJump(nums);
		System.out.println(result);
	}

	public static boolean canJump(int[] nums) {

		int maxJump = 0;
		for (int i = 0; i < nums.length; i++) {

			if (maxJump >= i) {
				maxJump = Math.max(maxJump, nums[i] + i);
			}
			if (maxJump >= nums.length - 1) {
				return true;
			}
		}
		return false;
	}
}
