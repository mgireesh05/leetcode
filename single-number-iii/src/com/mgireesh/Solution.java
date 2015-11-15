package com.mgireesh;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public int[] singleNumber(int[] nums) {
		int[] answer = new int[2];
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
		answer[0] = nums[list.get(0)];
		answer[1] = nums[list.get(1)];
		return answer;
	}
}
