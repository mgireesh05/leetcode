package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode head = null;
		ListNode hTemp = null;

		for (int i = 0; i < 10; i++) {
			ListNode temp = new ListNode(i);
			temp.next = head;
			head = temp;
		}

		hTemp = head;
		while (hTemp != null) {
			System.out.printf("%d ", hTemp.val);
			hTemp = hTemp.next;
		}

		head = sol.removeNthFromEnd(head, 10);

		System.out.println();

		hTemp = head;
		while (hTemp != null) {
			System.out.printf("%d ", hTemp.val);
			hTemp = hTemp.next;
		}
	}
}
