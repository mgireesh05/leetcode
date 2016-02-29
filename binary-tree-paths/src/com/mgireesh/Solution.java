package com.mgireesh;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		if (root != null) {
			traverse(list, root, sb);
		}
		return list;
	}

	private void traverse(List<String> list, TreeNode root, StringBuilder sb) {
		if (root.left == null && root.right == null) {
			int len = sb.length();
			sb.append(root.val);
			list.add(sb.toString());
			sb.setLength(len);
			return;
		}

		sb.append(root.val);
		sb.append("->");
		if (root.left != null) {
			int len = sb.length();
			traverse(list, root.left, sb);
			sb.setLength(len);
		}
		if (root.right != null) {
			int len = sb.length();
			traverse(list, root.right, sb);
			sb.setLength(len);
		}
	}
}
