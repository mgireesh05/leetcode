package com.mgireesh;

public class App {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(4);
		// TreeNode root = new TreeNode(1);
		// root.left = new TreeNode(2);

		Solution sol = new Solution();
		System.out.println(sol.rightSideView(root));
	}

}
