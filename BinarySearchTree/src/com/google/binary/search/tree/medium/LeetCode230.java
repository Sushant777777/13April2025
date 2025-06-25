package com.google.binary.search.tree.medium;

public class LeetCode230 {
	public static void main(String[] args) {
		int k = 1;
		TreeNode treeNode = new TreeNode(3);
		treeNode.left = new TreeNode(1);
		treeNode.right = new TreeNode(4);

		treeNode.left.right = new TreeNode(2);

		int kthSmallest = kthSmallest(treeNode, k);
		System.out.println(kthSmallest);

	}

	static int ans = -1;
	static int count = 0;

	public static int kthSmallest(TreeNode root, int k) {
		inorder(root, k);
		return ans;
	}

	private static void inorder(TreeNode root, int k) {
		if (root == null)
			return;

		inorder(root.left, k);
		count++;

		if (k == count) {
			ans = root.val;
			return;
		}
		inorder(root.right, k);
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