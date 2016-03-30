package com.mgireesh;

public class App {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);

		ListNode temp = head;
		while (temp != null) {
			System.out.printf("%d->", temp.val);
			temp = temp.next;
		}

		Solution sol = new Solution();
		head = sol.swapPairs(head);
		System.out.println();

		temp = head;
		while (temp != null) {
			System.out.printf("%d->", temp.val);
			temp = temp.next;
		}
	}
}
