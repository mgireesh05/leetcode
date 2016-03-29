package com.mgireesh;

public class Solution {
	public int sumNumbers(TreeNode root) {
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		sum = sumNumbers(root, sb, sum);
		return sum;
	}

	private int sumNumbers(TreeNode root, StringBuilder sb, int sum) {
		if (root == null) {
			return sum;
		}

		sb.append(root.val);
		if (root.left == null && root.right == null) {
			sum += Integer.parseInt(sb.toString());
			System.out.println(Integer.parseInt(sb.toString()));
			return sum;
		}
		if (root.left != null) {
			sum = sumNumbers(root.left, sb, sum);
			sb.setLength(sb.length() - 1);
		}

		if (root.right != null) {
			sum = sumNumbers(root.right, sb, sum);
			sb.setLength(sb.length() - 1);
		}
		return sum;
	}
}
