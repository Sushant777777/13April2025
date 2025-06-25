package com.google.binarytree.easy;

public class LeetCode101 {
	public static void main(String[] args) {

		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		treeNode.right = new TreeNode(2);

		treeNode.left.left = new TreeNode(3);
		treeNode.left.right = new TreeNode(4);

		treeNode.right.left = new TreeNode(4);
		treeNode.right.right = new TreeNode(3);

		boolean symmetric = isSymmetric(treeNode);
		System.out.println(symmetric);

	}

	public static boolean isSymmetric(TreeNode root) {

		if (root == null) {
			return true;
		}

		return mirror(root.left, root.right);
	}

	private static boolean mirror(TreeNode left, TreeNode right) {

		if (left == null && right == null) {
			return true;
		}

		if (left == null || right == null)
			return false;

		return left.val == right.val && mirror(left.left, right.right) && mirror(left.right, right.left);
	}
}
