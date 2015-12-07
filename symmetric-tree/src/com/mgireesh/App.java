package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();

		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(2);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(3);
		t1.left.right = new TreeNode(4);
		t1.right.left = new TreeNode(4);
		t1.right.right = new TreeNode(3);

		TreeNode t2 = new TreeNode(1);
		t2.left = new TreeNode(2);
		t2.right = new TreeNode(2);
		t2.left.left = null;
		t2.left.right = new TreeNode(3);
		t2.right.left = null;
		t2.right.right = new TreeNode(3);

		System.out.println(sol.isSymmetric(t1));
		System.out.println(sol.isSymmetric(t2));
	}
}
