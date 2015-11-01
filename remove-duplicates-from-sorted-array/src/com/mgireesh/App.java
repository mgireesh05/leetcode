package com.mgireesh;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums0 = {};
		int[] nums1 = { 1 };
		int[] nums2 = { 1, 3, 4, 4, 5, 5, 6 };
		int[] nums3 = { 1, 2, 3, 4, 5 };
		int[] nums4 = { 1, 1, 1, 1, 5 };
		System.out.println(sol.removeDuplicates(nums0) + " : " + Arrays.toString(nums0));
		System.out.println(sol.removeDuplicates(nums1) + " : " + Arrays.toString(nums1));
		System.out.println(sol.removeDuplicates(nums2) + " : " + Arrays.toString(nums2));
		System.out.println(sol.removeDuplicates(nums3) + " : " + Arrays.toString(nums3));
		System.out.println(sol.removeDuplicates(nums4) + " : " + Arrays.toString(nums4));
	}

}
