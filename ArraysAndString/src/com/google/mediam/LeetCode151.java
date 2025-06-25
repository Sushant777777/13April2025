package com.google.mediam;

public class LeetCode151 {
	public static void main(String[] args) {
		String s = "the sky is blue";
		String result = reverseWords(s);
		System.out.println(result);
	}

	public static String reverseWords(String s) {

        String[] ss = s.trim().split("\\s+");
        StringBuilder b = new StringBuilder();

        for (int i = ss.length - 1; i >= 0; i--) {
            b.append(ss[i]);
            if (i != 0) b.append(" ");
        }

        return b.toString();
	}
}
