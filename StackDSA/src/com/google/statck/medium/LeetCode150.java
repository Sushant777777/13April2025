package com.google.statck.medium;

import java.util.Stack;

public class LeetCode150 {

	Stack<Integer> stack;
	Stack<Integer> minStack;

	public LeetCode150() {
	    stack = new Stack<>();
	    minStack = new Stack<>();
	}

	public void push(int val) {

		stack.push(val);

		if (minStack.isEmpty() || minStack.peek() >= val)
			minStack.push(val);

	}

	public void pop() {
		int poppedValue = stack.pop();

	    // If popped value == top of the minStack,
	    // pop it from the minStack as well
	    if (poppedValue == minStack.peek())
	      minStack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}

}
