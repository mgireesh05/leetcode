package com.mgireesh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> answer = new LinkedList<List<Integer>>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		if (nums.length < 3) {
			return answer;
		}

		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int[] twoSumResult = twoSum(nums, -nums[i]);
			if ((twoSumResult[0] != 0) || (twoSumResult[1] != 0)) {
				List<Integer> solSet = new LinkedList<Integer>();
				solSet.add(nums[i]);
				solSet.add(nums[twoSumResult[0]]);
				solSet.add(nums[twoSumResult[1]]);
				if ((0 == nums[twoSumResult[0]]) && (0 == nums[twoSumResult[1]])) {
					if (!map.containsKey(hashCode(nums[i], nums[twoSumResult[0]], nums[twoSumResult[1]]))) {
						map.put(hashCode(nums[i], nums[twoSumResult[0]], nums[twoSumResult[1]]), i);
						answer.add(solSet);
					}
				} else {
					if (!map.containsKey(hashCode(i, twoSumResult[0], twoSumResult[1]))) {
						map.put(hashCode(i, twoSumResult[0], twoSumResult[1]), i);
						answer.add(solSet);
					}
				}
			}
		}
		return answer;
	}

	public Integer hashCode(int x, int y, int z) {

		return (Integer) (x ^ y ^ z);
	}

	public int[] twoSum(int[] nums, int target) {
		int[] answer = new int[2];
		answer[0] = 0;
		answer[1] = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				answer[0] = map.get(nums[i]);
				answer[1] = i;
				break;
			} else {
				map.put(target - nums[i], i);
			}
		}
		return answer;
	}
}