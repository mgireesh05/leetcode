package com.mgireesh;

public class Solution {
	public void moveZeroes(int[] nums) {
		int nextZero = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				if (nextZero == -1) {
					nextZero = i;
				}
			} else {
				if (nextZero != -1) {
					nums[nextZero] = nums[i];
					nums[i] = 0;
					nextZero += 1;
				}
			}
		}
	}
}
