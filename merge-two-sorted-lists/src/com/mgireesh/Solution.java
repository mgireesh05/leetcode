package com.mgireesh;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode temp = null;

		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}

		/* Initialize head */
		if (l1.val < l2.val) {
			head = temp = l1;
			l1 = l1.next;
		} else {
			head = temp = l2;
			l2 = l2.next;
		}

		while (true) {
			if (l1 == null) {
				temp.next = l2;
				break;
			} else if (l2 == null) {
				temp.next = l1;
				break;
			} else {
				if (l1.val < l2.val) {
					temp.next = l1;
					l1 = l1.next;
				} else {
					temp.next = l2;
					l2 = l2.next;
				}
				temp = temp.next;
			}
		}

		return head;
	}
}