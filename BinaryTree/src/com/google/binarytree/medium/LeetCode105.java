package com.google.binarytree.medium;

import java.util.HashMap;
import java.util.Map;

public class LeetCode105 {
	public static void main(String[] args) {
		int[] preorder = { 3, 9, 20, 15, 7 }, inorder = { 9, 3, 15, 20, 7 };

		TreeNode tree = buildTree(preorder, inorder);
		System.out.println(tree);
	}

	public static TreeNode buildTree(int[] preOrder, int[] inOrder) {

		Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
		for (int i = 0; i < inOrder.length; i++)
			inOrderIndexMap.put(inOrder[i], i);

		return splitTree(preOrder, inOrderIndexMap, 0, 0, inOrder.length - 1);

	}

	private static TreeNode splitTree(int[] preOrder, Map<Integer, Integer> inOrderIndexMap, int rootIndex, int left,
			int right) {

		TreeNode root = new TreeNode(preOrder[rootIndex]);

		int mid = inOrderIndexMap.get(preOrder[rootIndex]);

		if (mid > left)

			root.left = splitTree(preOrder, inOrderIndexMap, rootIndex + 1, left, mid - 1);

		if (mid < right)

			root.right = splitTree(preOrder, inOrderIndexMap, rootIndex + mid - left + 1, mid + 1, right);

		return root;
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