package com.mgireesh;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	Queue<TreeNode> q = new LinkedList<TreeNode>();

	public void flatten(TreeNode root) {
		if (root == null) {
			return;
		}

		flattenTree(root);
		root = null;
		TreeNode nxt = null;
		while (!q.isEmpty()) {
			TreeNode temp = q.remove();
			if (root == null) {
				root = temp;
				nxt = root;
			} else {
				nxt.right = temp;
				nxt = nxt.right;
			}
		}
	}

	private void flattenTree(TreeNode root) {
		if (root == null) {
			return;
		}
		q.add(root);
		flattenTree(root.left);
		flattenTree(root.right);
	}
}