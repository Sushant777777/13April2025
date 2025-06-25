package com.google.mediam;

public class LeetCode45 {
	public static void main(String[] args) {
		int nums[] = { 2, 3, 1, 1, 4 };
		int result = jump(nums);
		System.out.println(result);
	}

	public static int jump(int[] nums) {

		int maxJump = 0;
		int jump = 0;
		int index = 0;
		if (nums.length > 1) {
			for (int i = 0; i < nums.length; i++) {

				maxJump = Math.max(maxJump, nums[i] + i);

				if (index == i) {
					index = maxJump;
					jump++;
					if (maxJump >= nums.length - 1) {
						return jump;
					}
				}

			}
		}
		return jump;

	}
}
