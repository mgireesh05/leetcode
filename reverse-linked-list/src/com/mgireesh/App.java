package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();

		ListNode head = new ListNode(1);
		ListNode temp = head;
		temp.next = new ListNode(5);
		temp.next.next = new ListNode(8);

		temp = head;
		while (temp != null) {
			System.out.printf("%d->", temp.val);
			temp = temp.next;
		}

		temp = sol.reverseList(head);

		System.out.println();
		while (temp != null) {
			System.out.printf("%d->", temp.val);
			temp = temp.next;
		}
	}
}
