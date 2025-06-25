package com.google.statck.medium;

import java.util.Stack;

public class LeetCode155 {

	public static void main(String[] args) {
		String tokens[] = { "2", "1", "+", "3", "*" };
		int evalRPN = evalRPN(tokens);
		System.out.println(evalRPN);
	}

	public static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for (String token : tokens) {
			if (token.equals("+")) {
				stack.push(stack.pop() + stack.pop());
			} else if (token.equals("-")) {
				int b = stack.pop();
				int a = stack.pop();
				stack.push(a - b);
			} else if (token.equals("*")) {
				stack.push(stack.pop() * stack.pop());
			} else if (token.equals("/")) {
				int b = stack.pop();
				int a = stack.pop();
				stack.push(a / b);
			} else {
				stack.push(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}
}
