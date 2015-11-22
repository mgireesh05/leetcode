package com.mgireesh;

public class Solution {
	public int titleToNumber(String s) {
		s.toUpperCase();
		int col = 0;
		for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
			col += (int) Math.pow(26, j) * (s.charAt(i) - 'A' + 1);
		}

		return col;
	}
}
