package com.mgireesh;

public class Solution {
	public TreeNode invertTree(TreeNode root) {
		TreeNode leftSubTree = null;
		TreeNode rightSubTree = null;

		if (root != null) {
			leftSubTree = invertTree(root.left);
			rightSubTree = invertTree(root.right);
			root.left = rightSubTree;
			root.right = leftSubTree;
		}
		return root;
	}
}
