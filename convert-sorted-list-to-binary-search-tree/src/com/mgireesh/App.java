package com.mgireesh;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode head = null;
		for (int i = 5; i > 0; i--) {
			ListNode temp = new ListNode(i);
			temp.next = head;
			head = temp;
		}
		TreeNode root = sol.sortedListToBST(head);
		System.out.println(levelOrder(root));
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) {
			return new LinkedList<List<Integer>>();
		}

		List<List<Integer>> list = new LinkedList<List<Integer>>();
		List<Integer> level = new LinkedList<Integer>();
		Queue<TreeNode> curQ = new LinkedList<TreeNode>();
		Queue<TreeNode> nextQ = new LinkedList<TreeNode>();
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
				list.add(level);
				level = new LinkedList<Integer>();
			}
		}
		return list;
	}

}
