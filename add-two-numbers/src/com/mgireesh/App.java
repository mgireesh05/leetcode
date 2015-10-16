package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode lTemp;
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		l2.next.next.next = new ListNode(5);

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
