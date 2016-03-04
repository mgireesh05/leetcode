package com.mgireesh;

import java.util.LinkedList;
import java.util.List;

public class Solution {

	public List<String> generateParenthesis(int n) {
		List<String> list = new LinkedList<String>();
		StringBuilder sb = new StringBuilder();
		generate(list, sb, n, n, 0);
		return list;
	}

	public void generate(List<String> list, StringBuilder sb, int left,
			int right, int balance) {
		if (left == 0 && right == 0) {
			list.add(sb.toString());
			return;
		}

		int len = sb.length();
		if (left > 0) {
			sb.append("(");
			generate(list, sb, left - 1, right, balance + 1);
		}
		sb.setLength(len);

		len = sb.length();
		if (right > 0 && balance > 0) {
			sb.append(")");
			generate(list, sb, left, right - 1, balance - 1);
		}
		sb.setLength(len);

		return;
	}
}
