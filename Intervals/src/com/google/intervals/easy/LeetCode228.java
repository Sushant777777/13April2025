package com.google.intervals.easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode228 {
	public static void main(String[] args) {
		int nums[] = { 0, 1, 2, 4, 5, 7 };
		List<String> summaryRanges = summaryRanges(nums);
		System.out.println(summaryRanges);
	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < nums.length; i++) {
			int start = nums[i];
			while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
				i++;
			}
			if (start != nums[i])
				list.add(start + "->" + nums[i]);
			else
				list.add("" + start);
		}
		return list;
	}
}
