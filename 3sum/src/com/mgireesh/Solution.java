package com.mgireesh;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> answer = new LinkedList<List<Integer>>();
		int prev_i = 1;
		int prev_j = 2;
		int prev_k = 3;
		int find = 10;

		if (nums.length < 3) {
			return answer;
		}

		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				find = -(nums[i] + nums[j]);
				for (int k = nums.length - 1; k > j; k--) {
					if (nums[k] == find) {
						List<Integer> solSet = new LinkedList<Integer>();
						if (!((prev_i == nums[i]) && (prev_j == nums[j]) && (prev_k == nums[k]))) {
							solSet.add(nums[i]);
							solSet.add(nums[j]);
							solSet.add(nums[k]);
							answer.add(solSet);
							prev_i = nums[i];
							prev_j = nums[j];
							prev_k = nums[k];
						}
					} else if (find > nums[k]) {
						break;
					}
				}
			}
		}
		return answer;
	}
}