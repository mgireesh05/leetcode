package com.mgireesh;

public class Solution {
	public String reverseString(String s) {
		char[] str = s.toCharArray();
		for (int i = 0; i < s.length() / 2; i++) {
			char c = str[i];
			str[i] = str[s.length() - 1 - i];
			str[s.length() - 1 - i] = c;
		}
		return new String(str);
	}

}
