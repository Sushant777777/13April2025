package com.google.recursion.basic;

public class BasicLeveTwo {
	public static void main(String[] args) {
		int x = 0;
		int n = 5;

		recusrion(x, n);
	}

	private static void recusrion(int x, int n) {
		if (x >= n) {
			return;
		}
		System.out.println("Hello Sushant");
		recusrion(x + 1, n);
	}
}
