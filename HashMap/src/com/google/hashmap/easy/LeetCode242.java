package com.google.hashmap.easy;

public class LeetCode242 {
	public static void main(String[] args) {
		String s = "rat", t = "cat";
		boolean anagram = isAnagram(s, t);
		System.out.println(anagram);
	}

	public static boolean isAnagram(String s, String t) {
		
		if(s.length()!=t.length())
			return false;
		
		int charSet[] = new int[26];
		for (char c : s.toCharArray()) {
			charSet[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			if (charSet[c - 'a'] == 0)
				return false;
			charSet[c - 'a']--;
		}
		return true;
	}
}
