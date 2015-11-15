package com.mgireesh;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public int singleNumber(int[] nums) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			Integer prevIndex = map.put(nums[i], i);
			if (prevIndex == null) {
				list.add(i);
			} else {
				list.remove(prevIndex);
			}
		}
		return nums[list.get(0)];
	}
}
