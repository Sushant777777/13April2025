package com.google.binary.search.tree.medium;

public class LeetCode98 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);

		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(6);

		boolean validBST = isValidBST(root);
		System.out.println(validBST);
	}

	public static boolean isValidBST(TreeNode root) {

		return helper(root, Integer.MAX_VALUE, Integer.MAX_VALUE);

	}

	private static boolean helper(TreeNode root, int minValue, int maxValue) {
		if (root == null) {
			return true;
		}

		if (!(root.val > minValue && root.val < maxValue))
			return false;

		return helper(root.left, minValue, root.val) && helper(root.right, root.val, maxValue);
	}
}
