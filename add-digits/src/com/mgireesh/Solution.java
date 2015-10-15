package com.mgireesh;

public class Solution {
	public int addDigits(int num) {
		if (num < 0) {
			throw new IllegalArgumentException("Input can't be negative");
		} else {
			if (num != 0) {
				int answer = num % 9;
				return (answer != 0) ? answer : 9;
			} else {
				return 0;
			}
		}
	}
}