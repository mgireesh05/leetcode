package com.mgireesh;

public class Solution {
	public int lengthOfLastWord(String s) {
		int length = 0;
		boolean start = false;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (start == false) {
				if (s.charAt(i) != ' ') {
					start = true;
					length = 1;
				}
			} else {
				if (s.charAt(i) != ' ') {
					length++;
				} else {
					break;
				}
			}
		}
		return length;
	}
}