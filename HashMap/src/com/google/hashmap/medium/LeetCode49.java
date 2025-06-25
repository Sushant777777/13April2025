package com.google.hashmap.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode49 {
	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

		List<List<String>> groupAnagrams = groupAnagrams(strs);
		System.out.println(groupAnagrams);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
		for (String str : strs) {
			List<String> list = new ArrayList<String>();
			String sorted = getSortedString(str);
			if (hashMap.containsKey(sorted)) {
				list = hashMap.get(sorted);
				list.add(str);
				hashMap.put(sorted, list);
			} else {
				list.add(str);
				hashMap.put(sorted, list);
			}
		}
		return new ArrayList<>(hashMap.values());
	}

	private static String getSortedString(String str) {
		char charArr[] = str.toCharArray();
		Arrays.sort(charArr);
		return new String(charArr);
	}
}
