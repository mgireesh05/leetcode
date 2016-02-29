package com.mgireesh;

public class App {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.left.left = new TreeNode(16);
		root.right.left.right = new TreeNode(1);
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(22);
		root.right.right.left = new TreeNode(21);
		Solution sol = new Solution();
		System.out.println(sol.binaryTreePaths(root));
	}

}
