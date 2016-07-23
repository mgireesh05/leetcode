package com.mgireesh;

public class Solution {

	public int getSum(int a, int b) {
		int sum = a ^ b;
		int carry = (a & b) << 1;
		if (carry == 0) {
			return sum;
		} else {
			return getSum(sum, carry);
		}
	}
}
