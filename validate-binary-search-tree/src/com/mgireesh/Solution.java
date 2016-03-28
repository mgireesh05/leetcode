package com.mgireesh;

import java.util.Stack;

public class Solution {
	private Stack<Integer> stack = new Stack<Integer>();

	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		preorder(root);

		Integer prev = stack.pop();
		while (!stack.isEmpty()) {
			Integer cur = stack.pop();
			if (cur >= prev) {
				return false;
			}
			prev = cur;
		}

		return true;
	}

	private void preorder(TreeNode root) {
		if (root == null) {
			return;
		}

		preorder(root.left);
		stack.push(root.val);
		preorder(root.right);
	}
}
