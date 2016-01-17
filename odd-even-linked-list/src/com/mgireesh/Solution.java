package com.mgireesh;

public class Solution {
	public ListNode oddEvenList(ListNode head) {
		ListNode newHead = null;
		ListNode oddEnd = null;
		ListNode evenStart = null;
		ListNode evenEnd = null;
		ListNode temp = head;

		if (head == null || head.next == null) {
			return head;
		}

		int nodeCount = 1;
		while (temp != null) {
			if (nodeCount % 2 != 0) {
				// odd
				if (newHead == null) {
					newHead = temp;
					oddEnd = temp;
				} else {
					oddEnd.next = temp;
					oddEnd = temp;
				}
				temp = temp.next;
				oddEnd.next = null;
			} else {
				// even
				if (evenStart == null) {
					evenStart = temp;
					evenEnd = temp;
				} else {
					evenEnd.next = temp;
					evenEnd = temp;
				}
				temp = temp.next;
				evenEnd.next = null;
			}
			nodeCount++;
		}

		if (newHead != null) {
			oddEnd.next = evenStart;
		} else {
			newHead = evenStart;
		}

		return newHead;
	}
}
