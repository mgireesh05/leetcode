package com.mgireesh;

public class Solution {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode mPrevPtr = null;
		ListNode mPtr = null;
		ListNode nPtr = null;
		ListNode[] nNextPtr = { null };
		ListNode temp = head;
		if (n == m) {
			return head;
		}

		int mCount = 1;
		if (mCount != m) {
			while (mCount + 1 != m) {
				temp = temp.next;
				mCount++;
			}
			mPrevPtr = temp;
			mPtr = temp.next;
		} else {
			mPtr = head;
		}

		nPtr = reverseList(mPtr, nNextPtr, n - m);
		if (mPrevPtr != null) {
			mPrevPtr.next = nPtr;
		} else {
			head = nPtr;
		}
		mPtr.next = nNextPtr[0];
		return head;
	}

	public ListNode reverseList(ListNode head, ListNode[] nNextPtr, int count) {
		if (head == null) {
			return null;
		}

		ListNode prev = null;
		ListNode curr = head;
		ListNode next = null;
		while (count != 0) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count--;
		}
		nNextPtr[0] = curr.next;
		curr.next = prev;
		prev = curr;

		return prev;
	}
}
