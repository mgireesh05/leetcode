package com.mgireesh;

import java.util.Stack;

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode answer = null;
		ListNode temp = null;
		Stack<ListNode> stackA = new Stack<ListNode>();
		Stack<ListNode> stackB = new Stack<ListNode>();

		temp = headA;
		while (temp != null) {
			stackA.push(temp);
			temp = temp.next;
		}

		temp = headB;
		while (temp != null) {
			stackB.push(temp);
			temp = temp.next;
		}

		while (!stackA.isEmpty() && !stackB.isEmpty()) {
			ListNode tempA = stackA.pop();
			ListNode tempB = stackB.pop();
			if (tempA != tempB) {
				break;
			} else {
				answer = tempA;
			}
		}
		return answer;
	}
}