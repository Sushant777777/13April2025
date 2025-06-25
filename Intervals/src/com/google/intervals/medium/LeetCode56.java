package com.google.intervals.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LeetCode56 {
	public static void main(String[] args) {
		int intervals[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] merge = merge(intervals);
		System.out.println(merge);
	}

	public static int[][] merge(int[][] intervals) {

		Arrays.sort(intervals, Comparator.comparing(i -> i[0]));

		List<int[]> list = new ArrayList<int[]>();
		int[] newInterval = intervals[0];
		list.add(newInterval);
		for (int[] arr : intervals) {
			if (arr[0] < newInterval[1]) {
				newInterval[1] = Math.max(arr[1], newInterval[1]);
			} else {
				list.add(arr);
				newInterval = arr;
			}
		}

		return list.toArray(new int[list.size()][]);
	}
}
