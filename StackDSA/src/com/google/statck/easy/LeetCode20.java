package com.google.statck.easy;

import java.util.Stack;

public class LeetCode20 {
	public static void main(String[] args) {
		String s = "(]";
		boolean valid = isValid(s);
		System.out.println(valid);
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				Character top = stack.pop();
				if ((s.charAt(i) == ')' && top != '(') || (s.charAt(i) == '}' && top != '{')
						|| (s.charAt(i) == ']' && top != '[')) {
					return false;
				}
			}

		}
		return stack.isEmpty();
	}
}