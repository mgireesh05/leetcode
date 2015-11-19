package com.mgireesh;

public class Solution {

	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}

		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);

		if ((Math.abs(rightDepth - leftDepth) > 1) || (!isBalanced(root.left)) || (!isBalanced(root.right))) {
			return false;
		}
		return true;
	}

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);

		return Math.max(leftDepth, rightDepth) + 1;
	}
}
