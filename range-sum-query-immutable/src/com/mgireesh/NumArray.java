package com.mgireesh;

import java.util.HashMap;
import java.util.Map;

public class NumArray {
	private Map<String, Integer> map = new HashMap<String, Integer>();
	private int[] nums;

	public NumArray(int[] nums) {
		this.nums = nums;
	}

	public int sumRange(int start, int end) {
		String key = start + "-" + end;
		int sum = 0;
		if (map.containsKey(key)) {
			sum = map.get(key);
		} else {
			for (int i = start; i <= end; i++) {
				sum += nums[i];
			}
			map.put(key, sum);
		}
		return sum;
	}
}
