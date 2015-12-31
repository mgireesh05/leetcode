package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next.next = new ListNode(1);

		ListNode temp = head;
		while (temp != null) {
			System.out.printf("%d->", temp.val);
			temp = temp.next;
		}

		System.out.println();
		System.out.println(sol.isPalindrome(head));

	}

}
