package com.mgireesh;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 4, 9, 11 };
		int target = 12;
		Solution sol = new Solution();
		long startTime = System.currentTimeMillis();

		System.out.println(Arrays.toString(sol.twoSum(nums, target)));

		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Time taken:" + estimatedTime);
	}

}
