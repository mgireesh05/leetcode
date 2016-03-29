package com.mgireesh;

public class Solution {
	public TreeNode sortedListToBST(ListNode head) {
		return sortedListToBST(head, null);
	}

	private TreeNode sortedListToBST(ListNode head, ListNode tail) {
		if (head == tail) {
			return null;
		}

		if (head.next == tail) {
			return new TreeNode(head.val);
		}

		ListNode mid = findMid(head, tail);
		TreeNode root = new TreeNode(mid.val);
		root.left = sortedListToBST(head, mid);
		root.right = sortedListToBST(mid.next, tail);

		return root;
	}

	private ListNode findMid(ListNode head, ListNode tail) {
		if (head == tail || head.next == tail) {
			return head;
		}

		ListNode slow = head;
		ListNode fast = head.next.next;

		while (fast != tail) {
			slow = slow.next;
			fast = fast.next;
			if (fast != tail) {
				fast = fast.next;
			}
		}

		return slow;
	}
}
