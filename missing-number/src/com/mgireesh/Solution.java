package com.mgireesh;

public class Solution {
	public int missingNumber(int[] nums) {
		int total = (nums.length * (nums.length + 1)) / 2;
		int arraySum = 0;
		for (int i = 0; i < nums.length; i++) {
			arraySum += nums[i];
		}
		return total - arraySum;
	}
}