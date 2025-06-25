package com.google.intervals.medium;

import java.util.Arrays;

public class LeetCode57 {
	public static void main(String[] args) {
		int[][] intervals = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
		int[] newInterval = { 4, 8 };

		int[][] insert = insert(intervals, newInterval);
		System.out.println(insert);
	}

	public static int[][] insert(int[][] intervals, int[] newInterval) {

		int result[][] = new int[intervals.length + 1][2];

		int i = 0, j = 0;

		while (i < intervals.length && intervals[i][1] < newInterval[0]) {
			result[j++] = intervals[i++];
		}

		while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
			newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
			newInterval[1] = Math.max(newInterval[0], intervals[i++][1]);
		}

		result[j++] = newInterval;

		while (i < intervals.length) {
			result[j++] = intervals[i++];
		}

		return Arrays.copyOf(result, j);
	}
}
