package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode ltemp = null;

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(5);
		l1.next.next = new ListNode(7);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(6);

		ltemp = l1;
		while (ltemp != null) {
			System.out.printf("%d ", ltemp.val);
			ltemp = ltemp.next;
		}

		System.out.println();

		ltemp = l2;
		while (ltemp != null) {
			System.out.printf("%d ", ltemp.val);
			ltemp = ltemp.next;
		}

		l1 = sol.mergeTwoLists(l1, l2);

		System.out.println();

		ltemp = l1;
		while (ltemp != null) {
			System.out.printf("%d ", ltemp.val);
			ltemp = ltemp.next;
		}
	}
}
