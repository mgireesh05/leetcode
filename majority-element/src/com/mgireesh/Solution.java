package com.mgireesh;

import java.util.HashMap;

public class Solution {
	public int majorityElement(int[] nums) {
		int answer = nums[0];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int count = 1;
			if (map.containsKey(nums[i])) {
				count = map.get(nums[i]);
				count++;
				if (count > nums.length / 2) {
					answer = nums[i];
				}
			}
			map.put(nums[i], count);
		}

		return answer;
	}
}
