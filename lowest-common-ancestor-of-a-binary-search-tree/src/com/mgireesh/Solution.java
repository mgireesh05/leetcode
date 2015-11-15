package com.mgireesh;

public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode answer = null;
		if (root != null) {
			if ((p.val < root.val) && (q.val < root.val)) {
				answer = lowestCommonAncestor(root.left, p, q);
			} else if ((p.val > root.val) && (q.val > root.val)) {
				answer = lowestCommonAncestor(root.right, p, q);
			} else {
				answer = root;
			}
		}
		return answer;
	}
}