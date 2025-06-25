package com.google.hashmap.easy;

import java.util.HashMap;

public class LeetCode205 {
	public static void main(String[] args) {
		String s = "badc", t = "kikp";
		boolean isomorphic = isIsomorphic(s, t);
		System.out.println(isomorphic);
	}

	public static boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length())
			return false;

		HashMap<Character, Character> hashMap = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++) {
			char orignal = s.charAt(i);
			char replacement = t.charAt(i);

			if (!hashMap.containsKey(orignal)) {
				if (!hashMap.containsValue(replacement))
					hashMap.put(orignal, replacement);
				else
					return false;
			} else {
				char mappedValue = hashMap.get(orignal);
				if (mappedValue != replacement)
					return false;
			}
		}

		return true;

	}
}
