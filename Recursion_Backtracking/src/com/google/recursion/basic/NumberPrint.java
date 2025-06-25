package com.google.recursion.basic;

public class NumberPrint {
	public static void main(String[] args) {
		print(1);
	}

	private static void print(int a) {
		if (a == 5) {
			return;
		}
		System.out.println(a);
		a++;
		print(a);
	}
}
