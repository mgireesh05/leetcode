package com.mgireesh;

public class Solution {
	public boolean isPalindrome(ListNode head) {
		ListNode temp = head;
		ListNode first = null;
		ListNode mid = null;
		ListNode last = null;
		int len = 0;

		if ((temp == null) || (temp.next == null)) {
			return true;
		}

		while (temp != null) {
			len++;
			temp = temp.next;
		}

		int sz = 0;
		temp = head;
		if (len % 2 == 0) {
			first = head;
			while (sz < len / 2 - 1) {
				sz++;
				temp = temp.next;
			}
			last = temp.next;
			temp.next = null;
		} else {
			first = head;
			while (sz < len / 2 - 1) {
				sz++;
				temp = temp.next;
			}
			mid = temp.next;
			last = temp.next.next;
			temp.next = null;
			mid.next = null;
		}

		last = reverseList(last);

		ListNode tempf = first;
		ListNode templ = last;
		while (true) {
			if (((tempf == null) && (templ != null)) || ((templ == null) && (tempf != null))) {
				return false;
			}

			if ((tempf == null) && (templ == null)) {
				break;
			}

			if (tempf.val != templ.val) {
				return false;
			}
			tempf = tempf.next;
			templ = templ.next;
		}

		return true;
	}

	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode prev = null;
		ListNode curr = head;
		ListNode next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

}
