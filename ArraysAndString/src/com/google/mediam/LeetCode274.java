package com.google.mediam;

public class LeetCode274 {
	public static void main(String[] args) {
		int[] citations = { 3, 0, 6, 1, 5 };
		int result = hIndex(citations);
		System.out.println(result);
	}

	public static int hIndex(int[] citations) {
		int n = citations.length;
		int newArry[] = new int[n + 1];

		for (int i = 0; i < citations.length; i++) {
			if (citations[i] > n)
				newArry[n]++;
			else
				newArry[citations[i]]++;
		}

		int count = 0;

		for (int i = n; i >= 0; i--) {
			count += newArry[i];
			if (count >= i) {
				return i;
			}
		}

		return 0;

	}
}
