package com.mgireesh;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode lOut = null;
		ListNode lOutTemp = null;
		ListNode l1Temp = l1;
		ListNode l2Temp = l2;
		ListNode lTemp = null;
		Integer sum = 0;
		Integer carry = 0;

		if ((null == l1) && (null == l2)) {
			System.out.printf("Both operands null");
			return null;
		}

		if ((null == l1) || (null == l2)) {
			if (null == l1) {
				return l2;
			} else {
				return l1;
			}
		}

		while (true) {
			if (null == l1Temp) {
				break;
			}

			if (null == l2Temp) {
				break;
			}

			sum = l1Temp.val + l2Temp.val + carry;
			if (sum >= 10) {
				sum = sum - 10;
				carry = 1;
			} else {
				carry = 0;
			}

			if (null == lOut) {
				lOut = new ListNode(sum);
				lOutTemp = lOut;
			} else {
				lOutTemp.next = new ListNode(sum);
				lOutTemp = lOutTemp.next;
			}

			l1Temp = l1Temp.next;
			l2Temp = l2Temp.next;
		}

		if ((null != l1Temp) || (null != l2Temp)) {
			if (null != l2Temp) {
				lTemp = l2Temp;
			} else {
				lTemp = l1Temp;
			}

			while (null != lTemp) {
				if (0 != carry) {
					sum = lTemp.val + carry;
					if (sum >= 10) {
						sum = sum - 10;
						carry = 1;
					} else {
						carry = 0;
					}
					lOutTemp.next = new ListNode(sum);
					lOutTemp = lOutTemp.next;
				} else {
					lOutTemp.next = lTemp;
					break;
				}
				lTemp = lTemp.next;
			}
		}

		if (0 != carry) {
			lOutTemp.next = new ListNode(carry);
		}

		return lOut;
	}
}