package com.google.hashmap.easy;

import java.util.HashMap;

public class LeetCode290 {
	public static void main(String[] args) {
		String pattern = "abba", s = "dog cat cat fish";
		boolean wordPattern = wordPattern(pattern, s);
		System.out.println(wordPattern);
	}

	public static boolean wordPattern(String pattern, String s) {

		String[] arry = s.split(" ");

		if (pattern.length() != arry.length)
			return false;

		HashMap<Character, String> hashMap = new HashMap<Character, String>();

		for (int i = 0; i < pattern.length(); i++) {

			char orignal = pattern.charAt(i);
			String replacement = arry[i];

			if (!hashMap.containsKey(orignal)) {
				if (!hashMap.containsValue(replacement)) {
					hashMap.put(orignal, replacement);
				} else {
					return false;
				}
			} else {
				String mappedValue = hashMap.get(orignal);
				if (!mappedValue.equals(replacement))
					return false;
			}
		}

		return true;
	}
}
