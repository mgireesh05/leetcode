package com.mgireesh;

public class Solution {

	public int minDepth(TreeNode root) {

		if (root == null) {
			return 0;
		}

		if ((root.left == null) && (root.right == null)) {
			return 1;
		}

		if (root.left == null) {
			return minDepth(root.right) + 1;
		}

		if (root.right == null) {
			return minDepth(root.left) + 1;
		}

		int depthLeft = minDepth(root.left);
		int depthRight = minDepth(root.right);
		return Math.min(depthLeft, depthRight) + 1;
	}
}
