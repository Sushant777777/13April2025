package com.google.binary.search.tree.easy;

public class LeetCode530 {
	public static void main(String[] args) {

		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(2);
		node.right = new TreeNode(6);

		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(3);

		int minimumDifference = getMinimumDifference(node);
		System.out.println(minimumDifference);
	}

	static int min = Integer.MAX_VALUE;
	static Integer prev = null;

	public static int getMinimumDifference(TreeNode root) {

		if (root == null) {
			return min;
		}

		getMinimumDifference(root.left);

		if (prev != null) {
			min = Math.min(min, root.val - prev);
		}

		prev = root.val;

		getMinimumDifference(root.right);

		return min;

	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}