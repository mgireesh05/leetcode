package com.mgireesh;

import java.util.Stack;

public class Solution {
	Stack<TreeNode> stack = new Stack<TreeNode>();

	public void flatten(TreeNode root) {
		if (root == null) {
			return;
		}

		System.out.println(root.val);
		TreeNode left = root.left;
		TreeNode right = root.right;
		if (root.right != null) {
			stack.push(root.right);
		}
		flatten(left);
		flatten(right);
		if (root.right != null) {
			root.right = left;
			root.left = null;
		} else {
			if (!stack.isEmpty()) {
				root.right = stack.pop();
			}
			root.left = null;
		}
	}
}