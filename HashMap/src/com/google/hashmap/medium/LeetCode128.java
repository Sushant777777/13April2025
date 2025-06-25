package com.google.hashmap.medium;

import java.util.HashSet;
import java.util.Set;

public class LeetCode128 {
	public static void main(String[] args) {
		int arr[] = { 100, 4, 200, 1, 3, 2 };
		int longestConsecutive = longestConsecutive(arr);
		System.out.println(longestConsecutive);
	}

	public static int longestConsecutive(int[] nums) {

		Set<Integer> integers = new HashSet<Integer>();
		for (int num : nums) {
			integers.add(num);
		}

		int longest = 0;

		for (int num : integers) {
			if (!integers.contains(num - 1)) {
				int length = 1;

				while (integers.contains(num + length))
					length++;
				longest = Math.max(longest, length);
			}

		}
		return longest;
	}
}
