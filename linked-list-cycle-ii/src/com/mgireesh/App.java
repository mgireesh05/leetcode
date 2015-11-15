package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode cycle = null;

		ListNode head0 = new ListNode(1);
		head0.next = new ListNode(5);
		cycle = head0.next.next = new ListNode(7);
		head0.next.next.next = new ListNode(8);
		head0.next.next.next.next = cycle;
		System.out.println(sol.detectCycle(head0).val);

		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(5);
		head1.next.next = new ListNode(7);
		head1.next.next.next = new ListNode(8);
		System.out.println(sol.detectCycle(head1));

		ListNode head2 = new ListNode(1);
		head2.next = head2;
		System.out.println(sol.detectCycle(head2).val);

		ListNode head3 = new ListNode(1);
		System.out.println(sol.detectCycle(head3));
	}
}
