package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode lTemp;
		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(6);

		ListNode l2 = new ListNode(0);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);

		lTemp = l1;
		while (lTemp != null) {
			System.out.printf("%d ", lTemp.val);
			lTemp = lTemp.next;
		}

		System.out.println();
		lTemp = l2;
		while (lTemp != null) {
			System.out.printf("%d ", lTemp.val);
			lTemp = lTemp.next;
		}

		System.out.println();
		System.out.println("------");

		ListNode lOut = sol.addTwoNumbers(l1, l2);

		lTemp = lOut;
		while (lTemp != null) {
			System.out.printf("%d ", lTemp.val);
			lTemp = lTemp.next;
		}
	}
}
