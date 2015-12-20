package com.mgireesh;
import java.util.HashMap;

public class Solution {
	public int findPeakElement(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int peak = nums[0];
		map.put(peak, 0);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > peak) {
				peak = nums[i];
				map.put(peak, i);
			}
		}
		return map.get(peak);
	}
}
