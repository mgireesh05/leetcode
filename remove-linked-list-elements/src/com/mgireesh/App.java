package com.mgireesh;

public class App {

	public static void main(String[] args) {
		ListNode head = new ListNode(6);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(6);

		ListNode temp = head;
		while (temp != null) {
			System.out.printf("%d->", temp.val);
			temp = temp.next;
		}

		Solution sol = new Solution();
		head = sol.removeElements(head, 6);

		System.out.println();
		temp = head;
		while (temp != null) {
			System.out.printf("%d->", temp.val);
			temp = temp.next;
		}
	}

}
