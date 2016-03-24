package com.mgireesh;

public class Solution {

	public String countAndSay(int n) {
		if (n == 0) {
			return "";
		}
		return newSeq(n, "1");
	}

	private String newSeq(int n, String prev) {
		if (n == 1) {
			return prev;
		}

		StringBuilder sb = new StringBuilder();
		Integer count = 0;
		if (prev.length() == 1) {
			sb.append("11");
		} else {
			count = 1;
			for (int i = 1; i < prev.length(); i++) {
				if (prev.charAt(i - 1) == prev.charAt(i)) {
					count++;
				} else {
					sb.append(count.toString() + prev.charAt(i - 1));
					count = 1;
				}
			}
			sb.append(count.toString() + prev.charAt(prev.length() - 1));
		}

		return newSeq(n - 1, sb.toString());
	}
}
