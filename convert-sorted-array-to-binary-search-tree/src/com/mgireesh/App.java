package com.mgireesh;

public class App {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Solution sol = new Solution();
		TreeNode root = sol.sortedArrayToBST(nums);
		System.out.println(sol.levelOrder(root));
	}

}
