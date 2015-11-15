package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = { 1, 2, 3, 4 };
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}
		System.out.println();

		nums = sol.productExceptSelf(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}
		System.out.println();
	}

}
