package com.mgireesh;

public class Solution {
	public int climbStairsRecursive(int n) {
		if (n <= 2) {
			return n;
		}

		return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
	}

	// fibonacci series
	public int climbStairs(int n) {
		int a = 1;
		int b = 1;
		int sum = 1;
		for (int i = 2; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}

		return sum;
	}

}
