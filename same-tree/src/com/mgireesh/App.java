package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		TreeNode t1 = buildTree();
		TreeNode t2 = buildTree();
		System.out.println(sol.isSameTree(t1, t1));
		System.out.println(sol.isSameTree(t2, t2));
		System.out.println(sol.isSameTree(t1, t2));
	}

	public static TreeNode buildTree() {
		TreeNode root = null;
		for (int i = 0; i < 10; i++) {
			int val = (int) (Math.random() * 100);
			root = insertToTree(root, val);
		}
		return root;
	}

	public static TreeNode insertToTree(TreeNode root, int val) {
		if (root == null) {
			root = new TreeNode(val);
			root.left = null;
			root.right = null;
		} else if (val < root.val) {
			root.left = insertToTree(root.left, val);
		} else if (val > root.val) {
			root.right = insertToTree(root.right, val);
		} else {
			System.out.println("Duplicate ignored:" + val);
		}
		return root;
	}

	public static void preOrderPrint(TreeNode root) {
		if (root == null) {
			return;
		}
		preOrderPrint(root.left);
		System.out.println(root.val);
		preOrderPrint(root.right);
	}

}
