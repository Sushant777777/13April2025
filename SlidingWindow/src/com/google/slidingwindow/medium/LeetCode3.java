package com.google.slidingwindow.medium;

import java.util.HashSet;

public class LeetCode3 {
	public static void main(String[] args) {
		String s = "pwwkew";
		int result = lengthOfLongestSubstring(s);
		System.out.println(result);
	}

	public static int lengthOfLongestSubstring(String s) {

		HashSet<Character> characters = new HashSet<Character>();
		int index = 0;
		int maxResult = 0;
		for (int i = 0; i < s.length(); i++) {
			while (characters.contains(s.charAt(i))) {
				characters.remove(s.charAt(index));
				index++;
			}
			characters.add(s.charAt(i));
			maxResult = Math.max(maxResult, i - index + 1);

		}

		return maxResult;
	}
}
