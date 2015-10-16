package com.mgireesh;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode lOut;
		ListNode lTemp;

		lTemp = l1;
		while (lTemp != null) {
			// System.out.printf("%d ", lTemp.val);
			lTemp = lTemp.next;
		}

		// System.out.println();
		lTemp = l2;
		while (lTemp != null) {
			// System.out.printf("%d ", lTemp.val);
			lTemp = lTemp.next;
		}

		return l1;
	}
}