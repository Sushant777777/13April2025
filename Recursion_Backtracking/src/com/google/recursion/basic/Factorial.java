package com.google.recursion.basic;

public class Factorial {
	public static void main(String[] args) {
		int fact = factCal(6);
		System.out.println(fact);
	}

	private static int factCal(int i) {
		if (i == 1) {
			return 1;
		}

		return i * factCal(i - 1);
	}
}
