package com.google.binarytree.easy;

public class LeetCode222 {
	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		treeNode.right = new TreeNode(3);

		treeNode.left.left = new TreeNode(4);
		treeNode.left.right = new TreeNode(5);

		treeNode.right.left = new TreeNode(6);

		int countNodes = countNodes(treeNode);
		System.out.println(countNodes);
	}

	public static int countNodes(TreeNode root) {

		int leftCount = countLeft(root);
		int rightCount = CountRight(root);

		if (leftCount == rightCount) {
			return (int) (Math.pow(2, rightCount) - 1);
		} else {
			return 1 + countNodes(root.left) + countNodes(root.right);
		}
	}

	private static int CountRight(TreeNode root) {
		int depth = 0;
		while (root != null) {
			root = root.left;
			depth++;
		}
		return depth;
	}

	private static int countLeft(TreeNode root) {
		int depth = 0;
		while (root != null) {
			root = root.right;
			depth++;
		}
		return depth;
	}

}
