package com.google.traversal.binary.tree;

public class LevelOrderTraversal {

	BinaryNode root = null;

	public void levelOrder(BinaryNode root) {

		if (root == null) {
			return;
		}
		System.out.println(root.value);
		levelOrder(root.left);
		levelOrder(root.right);
	}
}
