package com.google.hashmap.easy;

import java.util.HashSet;
import java.util.Set;

public class LeetCode202 {
	public static void main(String[] args) {
		int n = 2;
		boolean happy = isHappy(n);
		System.out.println(happy);
	}

	public static boolean isHappy(int n) {

		Set<Integer> integers = new HashSet<Integer>();
		while (true) {
			int sum = 0;
			while (n != 0) {
				sum += Math.pow(n % 10, 2.0);
				n = n / 10;
			}

			if (sum == 1) {
				return true;
			}

			n = sum;

			if (integers.contains(sum))
				return false;

			integers.add(sum);
		}

	}
}
