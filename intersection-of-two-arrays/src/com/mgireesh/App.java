package com.mgireesh;

public class App {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		Solution sol = new Solution();
		int[] intersection = sol.intersection(nums1, nums2);
		for (int i = 0; i < intersection.length; i++) {
			System.out.printf("%d ", intersection[i]);
		}

	}

}
