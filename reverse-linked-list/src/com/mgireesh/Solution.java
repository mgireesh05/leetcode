package com.mgireesh;

public class Solution {
	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode prev = null;
		ListNode curr = head;
		ListNode next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}