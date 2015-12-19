package com.mgireesh;

public class Solution {
	public int[] plusOne(int[] digits) {
		int sum = 0;
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			sum = digits[i] + carry;
			if (sum >= 10) {
				sum = sum - 10;
				carry = 1;
			} else {
				carry = 0;
			}
			digits[i] = sum;
		}
		if (carry != 0) {
			int[] answer = new int[digits.length + 1];
			answer[0] = 1;
			for (int i = 1; i < answer.length - 1; i++) {
				answer[i] = digits[i];
			}
			return answer;
		}
		return digits;
	}
}