package com.google.binarytree.easy;

public class LeetCode100 {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(2);
		t1.right = new TreeNode(3);

		TreeNode t2 = new TreeNode(1);
		t2.left = new TreeNode(2);
		t2.right = new TreeNode(5);

		boolean sameTree = isSameTree(t1, t2);
		System.out.println(sameTree);
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null) {
			return true;
		}

		if (p != null && q != null && p.val == q.val) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}
		return false;

	}
}
