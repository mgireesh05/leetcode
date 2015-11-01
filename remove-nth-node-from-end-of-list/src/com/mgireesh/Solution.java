package com.mgireesh;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode tortoise = head;
		ListNode hare = head;

		/* Move hare n positions ahead of tortoise */
		for (int i = 0; i < n; i++) {
			hare = hare.next;
		}

		/* If we've already reached the end, then remove the first node */
		if (hare == null) {
			head = head.next;
		} else {
			/*
			 * When hare reaches the end, tortoise.next will be pointing to n'th
			 */
			while (hare.next != null) {
				tortoise = tortoise.next;
				hare = hare.next;
			}

			/* Remove n'th */
			tortoise.next = tortoise.next.next;
		}
		return head;
	}
}
