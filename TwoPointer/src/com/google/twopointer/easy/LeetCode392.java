package com.google.twopointer.easy;

public class LeetCode392 {
	public static void main(String[] args) {
		String s = "aec", t = "ahbgdc";
		boolean result = isSubsequence(s, t);
		System.out.println(result);
	}

	public static boolean isSubsequence(String s, String t) {
		int sp = 0;
		int tp = 0;
		while (sp < s.length() && tp < t.length()) {
			if (s.charAt(sp) == t.charAt(tp)) {
				sp++;
			}
			tp++;
		}
		return sp == s.length();
	}
}
