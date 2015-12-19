package com.mgireesh;

import java.util.HashSet;

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		HashSet<Integer> set = new HashSet<Integer>();
		ListNode temp = head;
		ListNode prev = head;
		while (temp != null) {
			if (set.contains(temp.val)) {
				prev.next = temp.next;
			} else {
				set.add(temp.val);
				prev = temp;
			}
			temp = temp.next;
		}
		return head;
	}
}