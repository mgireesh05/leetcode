package com.mgireesh;

public class Solution {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		int result = 0;
		int mask = 0x80000000;
		int pos = 0;
		for (int i = 0; i < 32; i++) {

			if ((n & mask) != 0) {
				result = result | (1 << pos);
			}
			pos++;
			mask >>>= 1;
		}
		return result;
	}
}