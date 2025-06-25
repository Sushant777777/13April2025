package com.google.binarytree.medium;

import java.util.HashMap;
import java.util.Map;

public class LeetCode106 {
	public static void main(String[] args) {
		int[] inorder = { 9, 3, 15, 20, 7 }, postorder = { 9, 15, 7, 20, 3 };
		TreeNode tree = buildTree(inorder, postorder);
		System.out.println(tree);
	}

	public static TreeNode buildTree(int[] inorder, int[] postorder) {
		Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
		for (int i = 0; i <= inorder.length - 1; i++)
			inOrderIndexMap.put(postorder[i], i);

		return splitTree(inorder, postorder, 0, postorder.length - 1, inorder.length - 1, inOrderIndexMap);

	}

	private static TreeNode splitTree(int[] inorder, int[] postorder, int startIndex, int endIndex, int k,
			Map<Integer, Integer> inOrderIndexMap) {

		if (startIndex > endIndex) {
			return null;
		}

		TreeNode root = new TreeNode(postorder[k--]);
		int i = inOrderIndexMap.get(root.val);

		if (i + 1 <= endIndex)
			root.right = splitTree(inorder, postorder, i + 1, endIndex, k, inOrderIndexMap);
		if (startIndex <= i - 1)
			root.left = splitTree(inorder, postorder, startIndex, i - 1, k, inOrderIndexMap);

		return root;
	}

}
