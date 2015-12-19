package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		// int[] nums = { 1, 1, 2, 3, 1 };
		// int[] nums = { 1 };
		// int[] nums = { 2, 1 };
		int[] nums = { 1, 1 };
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}
		System.out.println();
		System.out.println(sol.removeElement(nums, 1));
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}

	}
}
