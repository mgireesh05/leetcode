package com.mgireesh;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> answer = new LinkedList<List<Integer>>();

		if (nums.length < 3) {
			return answer;
		}

		Arrays.sort(nums);
		int find = 0;

		int prev_i = nums[0] - 1;
		for (int i = 0; i < nums.length - 2; i++) {
			if ((prev_i != nums[0] - 1) && (nums[i] == prev_i)) {
				continue;
			}
			prev_i = nums[i];

			int prev_j = nums[0] - 1;
			for (int j = i + 1; j < nums.length - 1; j++) {
				if ((prev_j != nums[0] - 1) && (nums[j] == prev_j)) {
					continue;
				}
				prev_j = nums[j];

				find = -(nums[i] + nums[j]);

				int prev_k = nums[0] - 1;
				for (int k = nums.length - 1; k > j; k--) {
					if ((prev_k != nums[0] - 1) && (find == prev_k)) {
						continue;
					}

					if (nums[k] == find) {
						List<Integer> solSet = new LinkedList<Integer>();
						solSet.add(nums[i]);
						solSet.add(nums[j]);
						solSet.add(nums[k]);
						answer.add(solSet);
						prev_k = find;
					} else if (find > nums[k]) {
						break;
					}
				}
			}
		}
		return answer;
	}
}