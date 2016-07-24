package com.mgireesh;

public class GuessGame {
	private int val = 6;

	protected int guess(int num) {
		if (num < val) {
			return -1;
		} else if (num > val) {
			return 1;
		} else {
			return 0;
		}
	}
}
