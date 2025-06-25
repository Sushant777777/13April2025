package com.google.easy;

public class LeetCode28 {
	public static void main(String[] args) {
		String haystack = "a", needle = "a";
		int result = strStr(haystack, needle);
		System.out.println(result);
	}

	public static int strStr(String haystack, String needle) {
		for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;  
	}
}
