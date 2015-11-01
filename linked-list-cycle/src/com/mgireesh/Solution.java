package com.mgireesh;

public class Solution {
	public boolean hasCycle(ListNode head) {
		boolean answer = false;

		if (head == null) {
			return false;
		}

		ListNode tortoise = head;
		ListNode hare = head.next;
		while ((hare != null) && (hare.next != null)) {
			if (tortoise == hare) {
				answer = true;
				break;
			} else {
				tortoise = tortoise.next;
				hare = hare.next.next;
			}
		}
		return answer;
	}
}
