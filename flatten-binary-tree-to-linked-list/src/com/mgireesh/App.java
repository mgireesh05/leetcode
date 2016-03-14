package com.mgireesh;

public class App {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(6);

		Solution sol = new Solution();
		sol.flatten(root);

		while (root != null) {
			System.out.printf("%d->", root.val);
			root = root.right;
		}
	}
}
