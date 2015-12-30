package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums1 = { 1, 3, 5, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 4 };
		int n = 2;
		sol.merge(nums1, m, nums2, n);
		for (int i = 0; i < m + n; i++) {
			System.out.printf("%d ", nums1[i]);
		}

	}

}
