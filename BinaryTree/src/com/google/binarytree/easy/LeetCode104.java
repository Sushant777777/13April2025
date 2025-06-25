package com.google.binarytree.easy;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode104 {
	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(9);
		node.right = new TreeNode(20);
		node.left.left = new TreeNode(15);
		node.left.right = new TreeNode(7);

		int maxDepth = maxDepth(node);
		System.out.println(maxDepth);
	}

	public static int maxDepth(TreeNode root) {

		Queue<TreeNode> nodes = new LinkedList<TreeNode>();

		nodes.add(root);

		int noOfLevel = 0;

		while (true) {

			int queueSize = nodes.size();

			if (queueSize == 0) {
				return noOfLevel;
			}

			while (queueSize > 0) {
				TreeNode element = nodes.poll();

				if (element.left != null)
					nodes.add(element.left);
				if (element.right != null)
					nodes.add(element.right);
				queueSize--;
			}

			noOfLevel++;
		}

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
