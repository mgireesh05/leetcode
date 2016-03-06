package com.mgireesh;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
		levelOrder(list, root);
		return list;
	}

	private Deque<TreeNode> cur = new LinkedList<TreeNode>();
	private Deque<TreeNode> nxt = new LinkedList<TreeNode>();

	private void levelOrder(List<Integer> list, TreeNode root) {
		if (root == null) {
			return;
		}

		cur.add(root);
		list.add(cur.peekLast().val);
		while (!cur.isEmpty()) {
			TreeNode node = cur.remove();
			if (node != null) {
				if (node.left != null) {
					nxt.add(node.left);
				}

				if (node.right != null) {
					nxt.add(node.right);
				}
			}

			if (cur.isEmpty()) {
				if (!nxt.isEmpty()) {
					list.add(nxt.peekLast().val);
				}
				while (!nxt.isEmpty()) {
					cur.add(nxt.removeFirst());
				}
			}
		}
	}
}
