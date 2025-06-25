package com.google.recursion.basic;

public class ReverseNoAdd {

	public static void main(String[] args) {
		int no = 12345;
		int result = reverseNo(no);
		System.out.println(result);
	}

	static int sum = 0;

	private static int reverseNo(int no) {
		if (no == 0) {
			return sum;
		}

		int rem = no % 10;
		sum = sum * 10 + rem;
		return reverseNo(no / 10);
	}

}
