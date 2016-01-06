package com.mgireesh;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null) {
			return new LinkedList<List<Integer>>();
		}

		List<List<Integer>> list = new LinkedList<List<Integer>>();
		List<Integer> level = new LinkedList<Integer>();
		Queue<TreeNode> curQ = new LinkedList<TreeNode>();
		Queue<TreeNode> nextQ = new LinkedList<TreeNode>();
		Stack<List<Integer>> stack = new Stack<List<Integer>>();
		curQ.add(root);
		while (!curQ.isEmpty()) {
			TreeNode node = curQ.remove();
			if (node.left != null) {
				nextQ.add(node.left);
			}
			if (node.right != null) {
				nextQ.add(node.right);
			}

			level.add(node.val);
			if (curQ.isEmpty()) {
				curQ = nextQ;
				nextQ = new LinkedList<TreeNode>();
				stack.push(level);
				level = new LinkedList<Integer>();
			}
		}

		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}

		return list;
	}
}