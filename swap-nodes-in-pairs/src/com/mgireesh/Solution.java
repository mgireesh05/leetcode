package com.mgireesh;

public class Solution {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode t0 = null;
		ListNode t1 = head;
		ListNode t2 = head.next;
		ListNode t3 = head.next.next;
		head = t2;
		while (true) {
			t2.next = t1;
			t1.next = t3;
			if (t0 != null) {
				t0.next = t2;
			}
			if (t3 == null) {
				break;
			}

			t0 = t1;
			t1 = t3;
			t2 = t3.next;
			if (t2 == null) {
				break;
			}
			t3 = t3.next.next;
		}
		return head;
	}
}
