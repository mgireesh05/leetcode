package com.mgireesh;

public class Solution {
	public boolean isUgly(int num) {
		num = greatestDivisiblePow(num, 2);
		num = greatestDivisiblePow(num, 3);
		num = greatestDivisiblePow(num, 5);
		return (num == 1) ? true : false;
	}

	public int greatestDivisiblePow(int a, int b) {
		if ((a == 0) || (b == 0)) {
			return 0;
		}
		while (a % b == 0) {
			a = a / b;
		}
		return a;
	}
}
