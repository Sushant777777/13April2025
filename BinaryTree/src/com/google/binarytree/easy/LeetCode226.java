package com.google.binarytree.easy;

public class LeetCode226 {
	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(4);
		treeNode.left = new TreeNode(2);
		treeNode.right = new TreeNode(7);

		treeNode.left.left = new TreeNode(1);
		treeNode.left.right = new TreeNode(3);

		treeNode.right.left = new TreeNode(6);
		treeNode.right.right = new TreeNode(9);
		TreeNode invertTree = invertTree(treeNode);
		System.out.println(invertTree);
	}

	public static TreeNode invertTree(TreeNode root) {

		if (root == null) {
			return null;
		}

		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		invertTree(root.left);
		invertTree(root.right);

		return root;

	}
}
