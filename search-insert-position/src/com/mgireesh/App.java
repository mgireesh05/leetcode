package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = { 1, 3, 5, 6 }; // 5 -> 2
		System.out.println(sol.searchInsert(nums, 1));
		System.out.println(sol.searchInsert(nums, 3));
		System.out.println(sol.searchInsert(nums, 5));
		System.out.println(sol.searchInsert(nums, 6));
		System.out.println(sol.searchInsert(nums, 0));
		System.out.println(sol.searchInsert(nums, 4));
	}

}
