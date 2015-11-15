package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = { 0, 1, 0, 0, 0, 0, 3, 12, 0, 0, 0, -1 };
		// int[] nums = { 0 };
		// int[] nums = { 1 };
		// int[] nums = { 1, 2, 3 };
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}

		sol.moveZeroes(nums);
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}
	}

}
