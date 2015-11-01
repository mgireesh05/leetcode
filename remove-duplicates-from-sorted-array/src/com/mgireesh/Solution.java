package com.mgireesh;

public class Solution {
	public int removeDuplicates(int[] nums) {
		int answer = 1;
		int lastIndex = 0;

		if (nums.length < 2) {
			return nums.length;
		}

		int lastUnique = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (lastUnique != nums[i]) {
				lastUnique = nums[i];
				answer++;
				lastIndex++;
				nums[lastIndex] = nums[i];
			}
		}

		return answer;
	}
}