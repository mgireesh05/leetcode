package com.mgireesh;

public class Solution {
	public int countPrimes(int n) {
		if (n < 2) {
			return 0;
		}

		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = i;
		}

		list[0] = 0;
		list[1] = 0;

		for (int i = 2; i < n; i++) {
			if (list[i] == 0) {
				continue;
			}

			for (int j = i + i; j < n; j += i) {
				list[j] = 0;
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (list[i] != 0) {
				count++;
			}
		}
		return count;
	}
}
