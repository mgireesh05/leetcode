package com.mgireesh;

public class Solution {
	public String addBinary(String a, String b) {
		StringBuilder sum = new StringBuilder();
		Integer counter = (a.length() > b.length()) ? a.length() : b.length();
		int carry = 0;
		int sumInt = 0;
		for (int i = 0, j = a.length() - 1, k = b.length() - 1; i < counter; i++, j--, k--) {
			int aVal = 0;
			int bVal = 0;

			if (j >= 0) {
				aVal = Integer.parseInt(String.valueOf(a.charAt(j)));
			} else {
				aVal = 0;
			}

			if (k >= 0) {
				bVal = Integer.parseInt(String.valueOf(b.charAt(k)));
			} else {
				bVal = 0;
			}

			if (carry == 1) {
				if ((aVal == 1) && (bVal == 1)) {
					sumInt = 1;
					carry = 1;
				} else if ((aVal == 0) && (bVal == 0)) {
					sumInt = 1;
					carry = 0;
				} else {
					sumInt = 0;
					carry = 1;
				}
			} else {
				if ((aVal == 1) && (bVal == 1)) {
					sumInt = 0;
					carry = 1;
				} else if ((aVal == 0) && (bVal == 0)) {
					sumInt = 0;
					carry = 0;
				} else {
					sumInt = 1;
					carry = 0;
				}
			}

			sum.insert(0, Integer.toString(sumInt));
		}

		if (carry == 1) {
			sum.insert(0, Integer.toString(carry));
		}
		return sum.toString();
	}

	public String addBinaryEasy(String a, String b) {
		Long intSum = (long) 0;
		try {
			Long aInt = Long.parseLong(a, 2);
			Long bInt = Long.parseLong(b, 2);
			intSum = aInt + bInt;
		} catch (Exception e) {
			System.out.println("Input too big");
		}

		return Long.toBinaryString(intSum);
	}
}