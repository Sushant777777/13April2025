package com.google.hashmap.easy;

public class LeetCode383 {
	public static void main(String[] args) {
		String ransomNote = "aa", magazine = "aab";
		boolean result = canConstruct(ransomNote, magazine);
		System.out.println(result);
	}

	public static boolean canConstruct(String ransomNote, String magazine) {

		int charSet[] = new int[26];

		for (char c : magazine.toCharArray()) {
			charSet[c - 'a']++;
		}

		for (char c : ransomNote.toCharArray()) {
			if (charSet[c - 'a'] == 0)
				return false;
			charSet[c - 'a']--;
		}
		return true;
	}
}
