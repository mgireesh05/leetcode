package com.mgireesh;

public class Solution {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		int count = 0;
		for (int i = 0; i < 32; i++) {
			if (0 != (n & (1 << i))) {
				count++;
			}
		}
		return count;
	}
}