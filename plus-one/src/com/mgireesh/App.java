package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		// int[] digits = { 1, 0 };
		int[] digits = { 9, 9 };
		for (int i = 0; i < digits.length; i++) {
			System.out.printf("%d ", digits[i]);
		}

		System.out.println();
		digits = sol.plusOne(digits);

		for (int i = 0; i < digits.length; i++) {
			System.out.printf("%d ", digits[i]);
		}

	}

}
