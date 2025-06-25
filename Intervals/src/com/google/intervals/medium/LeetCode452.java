package com.google.intervals.medium;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode452 {
	public static void main(String[] args) {
		int point[][] = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
		int minArrowShots = findMinArrowShots(point);
		System.out.println(minArrowShots);
	}

	public static int findMinArrowShots(int[][] points) {

		if (points.length == 1)
			return 1;

		Arrays.sort(points, new Comparator<int[]>() {
			public int compare(int a1[], int a2[]) {
				if (a1[1] == a2[1])
					return 0;
				if (a1[1] < a2[1])
					return -1;
				return 1;
			}
		});

		int arreow = 1;

		int commenEndPoint = points[0][1];

		for (int i = 1; i < points.length; i++) {
			int currS = points[i][0];
			int currE = points[i][1];

			if (currS > commenEndPoint) {
				commenEndPoint = currE;
				arreow++;
			}
		}
		return arreow;

	}
}
