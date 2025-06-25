package com.google.recursion.basic;

public class ReverseNo {
	public static void main(String[] args) {
		int x = 5;
		int n = 0;

		reverseNo(x, n);
	}

	private static void reverseNo(int x, int n) {
		if (x == n) {
			return;
		}
		System.out.print(x + " ");
		reverseNo(x - 1, n);
	}
}
