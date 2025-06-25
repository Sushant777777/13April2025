package com.google.recursion.basic;

public class Basic {
	public static void main(String[] args) {
		int x = 0;
		recursion(x);
	}

	private static void recursion(int x) {
		if (x == 5) {
			return;
		}
		System.out.println("Hello Sushant");
		x++;
		recursion(x);
	}
}
