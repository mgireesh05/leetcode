package com.mgireesh;

import java.util.HashMap;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] answer = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				answer[0] = map.get(nums[i]) + 1;
				answer[1] = i + 1;
				break;
			} else {
				map.put(target - nums[i], i);
			}
		}
		return answer;
	}
}