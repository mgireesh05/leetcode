package com.mgireesh;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<String> summaryRanges(int[] nums) {
		List<String> list = new LinkedList<String>();

		if (nums.length < 1) {
			return list;
		}

		int startVal = nums[0];
		boolean start = true;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] + 1 != nums[i]) {
				StringBuilder sb = new StringBuilder();
				sb.append(startVal);
				if (startVal != nums[i - 1]) {
					sb.append("->");
					sb.append(nums[i - 1]);
				}
				list.add(sb.toString());
				startVal = nums[i];
				if (i == nums.length) {
					start = false;
				}
			}
		}

		if (start) {
			StringBuilder sb = new StringBuilder();
			sb.append(startVal);
			if (startVal != nums[nums.length - 1]) {
				sb.append("->");
				sb.append(nums[nums.length - 1]);
			}
			list.add(sb.toString());
		}
		return list;
	}
}
