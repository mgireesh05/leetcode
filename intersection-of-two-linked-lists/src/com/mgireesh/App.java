package com.mgireesh;

public class App {

	public static void main(String[] args) {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode b1 = new ListNode(3);
		ListNode b2 = new ListNode(4);
		ListNode b3 = new ListNode(5);
		ListNode c1 = new ListNode(6);
		ListNode c2 = new ListNode(7);
		ListNode c3 = new ListNode(8);

		a1.next = a2;
		a2.next = c1;
		c1.next = c2;
		c2.next = c3;
		c3.next = null;
		b1.next = b2;
		b2.next = b3;
		b3.next = c1;

		Solution sol = new Solution();
		System.out.println(sol.getIntersectionNode(a1, b1).val);

	}

}
