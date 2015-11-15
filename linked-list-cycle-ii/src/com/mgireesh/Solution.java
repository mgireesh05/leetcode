package com.mgireesh;

public class Solution {
	public ListNode detectCycle(ListNode head) {
		ListNode answer = null;
		ListNode met = null;
		if (head == null) {
			return null;
		}

		ListNode tortoise = head;
		ListNode hare = head.next;
		while ((hare != null) && (hare.next != null)) {
			if (tortoise == hare) {
				met = hare;
				break;
			} else {
				tortoise = tortoise.next;
				hare = hare.next.next;
			}
		}

		if (met != null) {
			ListNode temp1 = head;
			while (true) {
				ListNode temp2 = met;
				while (true) {
					if (temp2.next == temp1) {
						answer = temp1;
						break;
					}
					temp2 = temp2.next;
					if (temp2 == met) {
						break;
					}
				}

				if (answer != null) {
					break;
				}
				temp1 = temp1.next;
			}
		}
		return answer;
	}
}
