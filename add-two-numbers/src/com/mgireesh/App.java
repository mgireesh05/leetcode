package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next = new ListNode(4);

		ListNode lOut = sol.addTwoNumbers(l1, l2);
		System.out.println(lOut);
	}

}
