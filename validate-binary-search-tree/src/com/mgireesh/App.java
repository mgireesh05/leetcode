package com.mgireesh;

public class App {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);

		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.left.right.right = new TreeNode(4);

		root.right.left = new TreeNode(6);
		root.right.left.right = new TreeNode(7);
		root.right.right = new TreeNode(9);
		root.right.right.right = new TreeNode(10);

		preorder(root);
		Solution sol = new Solution();
		System.out.println(sol.isValidBST(root));
	}

	private static void preorder(TreeNode root) {
		if (root == null) {
			return;
		}
		preorder(root.left);
		System.out.println(root.val);
		preorder(root.right);
	}

}
