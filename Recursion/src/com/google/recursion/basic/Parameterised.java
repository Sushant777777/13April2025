package com.google.recursion.basic;

public class Parameterised {
	public static void main(String[] args) {
		int sum = 0;
		int n = 3;

		fun(n, sum);
	}

	private static void fun(int n, int sum) {
		if (n < 1) {
			System.out.println(sum);
			return;
		}

		fun(n - 1, sum + n);

	}
}
