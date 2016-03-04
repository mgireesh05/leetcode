package com.mgireesh;

public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		if (x < 10) {
			return true;
		}

		if (x % 10 == 0) {
			return false;
		}

		long a = 1;
		int len = 0;
		while (x / a != 0) {
			a *= 10;
			len++;
		}
		a /= 10;
		int b = 10;

		int mask = 1;
		int sub = 0;
		int prev = 0;
		for (int i = 0; i < len / 2; i++) {
			prev = x / (int) a;
			int left = prev - sub;
			int right = x % b;
			right /= mask;

			if (left != right) {
				return false;
			}
			a /= 10;
			b *= 10;
			mask *= 10;
			sub = prev * 10;
		}
		return true;
	}
}
