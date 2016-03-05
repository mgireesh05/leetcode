package com.mgireesh;

public class Solution {
	public void rotate(int[] nums, int k) {
		if (k < nums.length) {
			for (int i = nums.length - k, j = 0; i < nums.length; i++, j++) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			}

			for (int i = 0; i < k; i++) {
				rotateOnce(nums, k);
			}
		}
	}

	private void rotateOnce(int[] nums, int start) {
		if (start < nums.length) {
			int temp = nums[nums.length - 1];
			for (int i = nums.length - 1; i >= start; i--) {
				nums[i] = nums[i - 1];
			}
			nums[start] = temp;
		}
	}
}
