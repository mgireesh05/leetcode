package com.mgireesh;

public class Solution {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}

		while (head.val == val) {
			head = head.next;
			if (head == null) {
				return null;
			}
		}

		ListNode temp = head;
		while (temp.next != null) {
			if (temp.next.val == val) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		return head;
	}
}
