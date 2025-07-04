package com.google.easy;

public class LeetCode88 {
	public static void main(String[] args) {
		int num1[] = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int nums2[] = { 2, 5, 6 };
		int n = 3;

		merge(num1, m, nums2, n);
		System.out.println();
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int temp[] = new int[m];

		for (int i = 0; i < m; i++) {
			temp[i] = nums1[i];
		}

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < m && j < n) {
			if (temp[i] <= nums2[j]) {
				nums1[k++] = temp[i++];
			} else {
				nums1[k++] = nums2[j++];
			}

		}

		while (i < m) {
			nums1[k++] = temp[i++];
		}

		while (j < n) {
			nums1[k++] = nums2[j++];
		}
	}

}
