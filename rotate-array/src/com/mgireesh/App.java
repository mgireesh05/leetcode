package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		// int[] nums = { 1 };
		for (int i : nums) {
			System.out.printf("%d ", i);
		}
		sol.rotate(nums, 1);
		System.out.println();
		for (int i : nums) {
			System.out.printf("%d ", i);
		}
	}
}
