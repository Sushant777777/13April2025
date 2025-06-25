package com.google.statck.medium;

import java.util.Stack;

public class LeetCode71 {
	public static void main(String[] args) {
		String path = "/home//foo/";
		String simplifyPath = simplifyPath(path);
		System.out.println(simplifyPath);
	}

	public static String simplifyPath(String path) {
		Stack<String> characters = new Stack<String>();
		String s[] = path.split("/");

		for (String forString : s) {
			if (forString.equals(".") || forString.isEmpty())
				continue;
			else if (forString.equals("..")) {
				if (!characters.isEmpty())
					characters.pop();
			} else {
				characters.push(forString);
			}
		}
		return "/" + String.join("/", characters);
	}
}
