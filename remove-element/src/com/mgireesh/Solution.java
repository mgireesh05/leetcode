package com.mgireesh;

public class Solution {
	public int removeElement(int[] nums, int val) {
		int tail = nums.length - 1;
		int i = 0;
		int count = nums.length;

		if (nums.length == 0) {
			return 0;
		}

		while (i <= tail) {
			if (nums[i] == val) {
				while ((tail >= 0) && (nums[tail] == val)) {
					tail--;
					count--;
				}

				if (i < tail) {
					int temp = nums[i];
					nums[i] = nums[tail];
					nums[tail] = temp;
					tail--;
					count--;
				}
			}
			i++;
		}
		return count;
	}
}