package com.mgireesh;

public class Solution {

	public void flatten(TreeNode root) {
		if (root == null) {
			return;
		}

		// Save left and right
		TreeNode left = root.left;
		TreeNode right = root.right;

		// Detach left subtree
		root.left = null;

		// recurse left subtree
		flatten(left);
		// recurse right subtree
		flatten(right);

		// attach flattened left sub tree
		root.right = left;

		// traverse to the end
		TreeNode cur = root;
		while (cur.right != null) {
			cur = cur.right;
		}

		// attach flattened right sub tree to the end
		cur.right = right;
	}
}