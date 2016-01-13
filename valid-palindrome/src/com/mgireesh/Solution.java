package com.mgireesh;

public class Solution {
	public boolean isPalindrome(String s) {
		boolean answer = true;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c) || Character.isLetter(c)) {
				sb.append(Character.toLowerCase(c));
			}
		}

		s = sb.toString();
		for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}

		return answer;
	}
}
