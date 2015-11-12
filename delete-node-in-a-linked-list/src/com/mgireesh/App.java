package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode head = null;
		ListNode hTemp = null;
		ListNode delNode = null;

		for (int i = 0; i < 10; i++) {
			ListNode temp = new ListNode(i);
			temp.next = head;
			head = temp;
			if (i == 5) {
				delNode = temp;
			}
		}

		hTemp = head;
		while (hTemp != null) {
			System.out.printf("%d ", hTemp.val);
			hTemp = hTemp.next;
		}

		sol.deleteNode(delNode);

		System.out.println();

		hTemp = head;
		while (hTemp != null) {
			System.out.printf("%d ", hTemp.val);
			hTemp = hTemp.next;
		}
	}
}
