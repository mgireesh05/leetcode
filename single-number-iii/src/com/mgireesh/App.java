package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = { 1, 2, 1, 3, 2, 5 };
		nums = sol.singleNumber(nums);
		for (int i = 0; i < 2; i++) {
			System.out.println(nums[i]);
		}

	}

}
