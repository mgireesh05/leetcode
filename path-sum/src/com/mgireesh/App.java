package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);

		root.left.left = new TreeNode(11);

		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);

		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);

		root.right.right.right = new TreeNode(1);

		System.out.println(sol.hasPathSum(root, 22));

	}

}
