package com.mgireesh;

public class Solution {
	public boolean isSymmetric(TreeNode root) {
		if ((root == null) || ((root.left == null) && (root.right == null))) {
			return true;
		}

		return isSymmetric(root.left, root.right);
	}

	public boolean isSymmetric(TreeNode left, TreeNode right) {
		if ((left == null) && (right == null)) {
			return true;
		}

		if (((null == left) && (null != right)) || ((null != left) && (null == right))) {
			return false;
		}

		return ((left.val == right.val) && (isSymmetric(left.left, right.right))
				&& (isSymmetric(left.right, right.left)));
	}
}