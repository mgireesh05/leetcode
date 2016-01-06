package com.mgireesh;

public class Solution {
	public int nthUglyNumber(int n) {
		int[] arr = new int[n];
		int i2 = 0;
		int i3 = 0;
		int i5 = 0;
		int next2 = 2;
		int next3 = 3;
		int next5 = 5;
		int nextNum = 1;
		arr[0] = 1;

		for (int i = 1; i < n; i++) {

			nextNum = Math.min(next2, Math.min(next3, next5));
			arr[i] = nextNum;
			if (nextNum == next2) {
				i2++;
				next2 = arr[i2] * 2;
			}

			if (nextNum == next3) {
				i3++;
				next3 = arr[i3] * 3;
			}

			if (nextNum == next5) {
				i5++;
				next5 = arr[i5] * 5;
			}

		}

		return nextNum;
	}
}
