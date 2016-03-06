package com.mgireesh;

import java.util.ArrayList;

public class Solution {
	public int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");

		ArrayList<String> l1 = new ArrayList<String>();
		for (String s : v1) {
			l1.add(s);
		}

		ArrayList<String> l2 = new ArrayList<String>();
		for (String s : v2) {
			l2.add(s);
		}

		for (int i = l1.size() - 1; i >= 0; i--) {
			Integer val = Integer.parseInt(l1.get(i));
			if (val.equals(0)) {
				l1.remove(i);
			} else {
				break;
			}
		}

		for (int i = l2.size() - 1; i >= 0; i--) {
			Integer val = Integer.parseInt(l2.get(i));
			if (val.equals(0)) {
				l2.remove(i);
			} else {
				break;
			}
		}

		int sz = l1.size() < l2.size() ? l1.size() : l2.size();
		for (int i = 0; i < sz; i++) {
			int v1i = Integer.parseInt(l1.get(i));
			int v2i = Integer.parseInt(l2.get(i));
			if (v1i > v2i) {
				return 1;
			} else if (v1i < v2i) {
				return -1;
			}
		}
		if (l1.size() > l2.size()) {
			return 1;
		} else if (l1.size() < l2.size()) {
			return -1;
		} else {
			return 0;
		}
	}
}
