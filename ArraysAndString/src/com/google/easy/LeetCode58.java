package com.google.easy;

public class LeetCode58 {
	public static void main(String[] args) {
		String s = "Hello World";
		int result = lengthOfLastWord(s);
		System.out.println(result);
	}

	public static int lengthOfLastWord(String s) {
		int result = 0;
		String arr[] = s.split(" ");
		for (String S : arr) {
			result = S.length();
		}
		return result;
	}
}
