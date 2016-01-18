package com.mgireesh;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {

	public List<String> generateParenthesis(int n) {
		List<String> list = new LinkedList<String>();

		if (n == 1) {
			list.add("()");
			return list;
		}

		List<String> prevList = generateParenthesis(n - 1);
		list = insert(prevList, n);
		return list;
	}

	public List<String> insert(List<String> prevList, int n) {
		List<String> list = new LinkedList<String>();
		Set<String> set = new HashSet<String>();
		for (String s : prevList) {
			String newS = "()" + s;
			set.add(newS);
			for (int i = 1; i < s.length(); i += 2) {
				newS = s.substring(0, i) + "()" + s.substring(i, s.length());
				set.add(newS);
			}
			newS = s + "()";
			set.add(newS);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append('(');
		}
		for (int i = 0; i < n; i++) {
			sb.append(')');
		}
		set.add(sb.toString());

		list.addAll(set);
		return list;
	}
}
