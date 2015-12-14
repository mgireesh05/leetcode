package com.mgireesh;

public class Solution {
	public boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}

		boolean answer = true;
		int num1s = 0;
		for (int i = 0; i < 31; i++) {
			if ((n & (1 << i)) != 0) {
				num1s++;
			}
			if (num1s > 1) {
				answer = false;
				break;
			}
		}
		return answer;
	}
}
