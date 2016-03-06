package com.mgireesh;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
	public void rotate(int[] nums, int k) {
		Deque<Integer> dq = (Deque<Integer>) new LinkedList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			dq.add(nums[i]);
		}

		for (int i = 0; i < k; i++) {
			int val = dq.removeLast();
			dq.push(val);
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = dq.pop();
		}
	}
}
