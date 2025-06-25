package com.google.binarytree.easy;

public class LeetCode112 {
	public static void main(String[] args) {

		TreeNode treeNode = new TreeNode(5);
		treeNode.left = new TreeNode(4);
		treeNode.right = new TreeNode(8);

		treeNode.left.left = new TreeNode(11);
		treeNode.left.left.left = new TreeNode(11);

		treeNode.left.left.left = new TreeNode(7);
		treeNode.left.left.right = new TreeNode(2);

		treeNode.right.left = new TreeNode(13);
		treeNode.right.right = new TreeNode(4);

		treeNode.right.right.right = new TreeNode(1);

		boolean hasPathSum = hasPathSum(treeNode, 22);
		System.out.println(hasPathSum);

	}

	public static boolean hasPathSum(TreeNode root, int targetSum) {

		if (root == null) {
			return false;
		}

		if (root.left == null && root.right == null) {
			return targetSum == root.val;
		}

		boolean value = hasPathSum(root.left, targetSum - root.val);

		boolean value2 = hasPathSum(root.right, targetSum - root.val);

		return value || value2;
	}
}
