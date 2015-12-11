package com.mgireesh;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		int answer = -1;

		if (target < nums[0]) {
			return 0;
		}

		if (target > nums[nums.length - 1]) {
			return nums.length;
		}

		int min = 0;
		int max = nums.length - 1;
		int mid = 0;

		while (max >= min) {
			mid = (min + max) / 2;
			if (nums[mid] == target) {
				answer = mid;
				break;
			} else {
				if (nums[mid] < target) {
					min = mid + 1;
					answer = min;
				} else {
					answer = mid;
					max = mid - 1;
				}
			}
		}

		return answer;
	}
}