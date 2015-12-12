package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();

		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		list.next.next.next = new ListNode(4);
		list.next.next.next.next = new ListNode(5);

		ListNode temp = list;
		while (temp != null) {
			System.out.printf("%d->", temp.val);
			temp = temp.next;
		}
		System.out.printf("NULL\n");

		list = sol.reverseBetween(list, 2, 4);
		// list = sol.reverseBetween(list, 3, 4);
		temp = list;
		while (temp != null) {
			System.out.printf("%d->", temp.val);
			temp = temp.next;
		}
		System.out.printf("NULL\n");
	}
}
