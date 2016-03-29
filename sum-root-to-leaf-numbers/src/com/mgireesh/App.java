package com.mgireesh;

public class App {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);

		root.left = new TreeNode(2);
		root.right = new TreeNode(8);

		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		Solution sol = new Solution();
		System.out.println(sol.sumNumbers(root));
	}
}
