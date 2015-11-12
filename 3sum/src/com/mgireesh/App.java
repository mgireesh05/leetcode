package com.mgireesh;

import java.util.List;

public class App {

	public static void main(String[] args) {
		// int[] nums = { -1, 0, 1, 2, -1, -4 };
		// int[] nums = { -4, -1, -1, 0, 1, 2, 2 };
		// int[] nums = { 0, 0, 0 };
		int[] nums = { 7, -1, 14, -12, -8, 7, 2, -15, 8, 8, -8, -14, -4, -5, 7, 9, 11, -4, -15, -6, 1, -14, 4, 3, 10,
				-5, 2, 1, 6, 11, 2, -2, -5, -7, -6, 2, -15, 11, -6, 8, -4, 2, 1, -1, 4, -6, -15, 1, 5, -15, 10, 14, 9,
				-8, -6, 4, -6, 11, 12, -15, 7, -1, -9, 9, -1, 0, -4, -1, -12, -2, 14, -9, 7, 0, -3, -4, 1, -2, 12, 14,
				-10, 0, 5, 14, -1, 14, 3, 8, 10, -8, 8, -5, -2, 6, -11, 12, 13, -7, -12, 8, 6, -13, 14, -2, -5, -11, 1,
				3, -6 };
		// int[] nums = { 0, 0 };
		Solution sol = new Solution();
		long startTime = System.currentTimeMillis();

		List<List<Integer>> answer = sol.threeSum(nums);
		System.out.println(answer);

		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("Time taken:" + estimatedTime);
	}

}
