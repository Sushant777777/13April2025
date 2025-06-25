package com.google.recursion.basic;

public class SumOFNo {
	public static void main(String[] args) {
		int sum = sumOfNo(1342);
		System.out.println(sum);
	}

	private static int sumOfNo(int i) {
		if (i == 0)
			return 0;
		return i % 10 + sumOfNo(i / 10);
	}
}
