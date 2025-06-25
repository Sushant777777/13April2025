package com.google.linkedlist.medium;

import java.util.HashMap;

public class LeetCode146 {

	public LeetCode146(int capacity) {
		LeetCode146 lRUCache = new LeetCode146(capacity);
	}

	public int get(int key) {
		return key;

	}

	public void put(int key, int value) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		if (hashMap.containsKey(key)) {
			
		} else {
			hashMap.put(key, value);
		}
	}
}
