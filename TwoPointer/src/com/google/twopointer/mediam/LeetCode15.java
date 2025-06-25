package com.google.twopointer.mediam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LeetCode15 {
	public static void main(String[] args) {
		int nums[] = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> threeSum = threeSum(nums);
		System.out.println(threeSum);
	}

	public static List<List<Integer>> threeSum(int[] arr) {

		Arrays.sort(arr);

		HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();
		for (int i = 0; i < arr.length - 2; i++) {

			int start = i + 1;
			int end = arr.length - 1;

			while (start < end) {

				if (arr[i] + arr[start] + arr[end] == 0) {
					hashSet.add(Arrays.asList(arr[i], arr[start], arr[end]));
					start++;
					end--;
				} else if (arr[i] + arr[start] + arr[end] < 0) {
					start++;
				} else {
					end--;
				}

			}
		}

		return new ArrayList<>(hashSet);
	}
}
