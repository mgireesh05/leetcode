package com.mgireesh;

public class Solution {
	public int maxProduct(String[] words) {
		int product = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (isDistinct(words[i], words[j])) {
					product = Math.max(product, words[i].length() * words[j].length());
				}
			}
		}
		return product;
	}

	public boolean isDistinct(String s1, String s2) {
		// Arrays.sort(s1.toCharArray());
		// Arrays.sort(s2.toCharArray());
		String longStr = null;
		String shortStr = null;

		if (s1.length() < s2.length()) {
			shortStr = s1;
			longStr = s2;
		} else {
			shortStr = s2;
			longStr = s1;
		}

		for (int i = 0; i < shortStr.length(); i++) {
			for (int j = 0; j < longStr.length(); j++) {
				if (shortStr.charAt(i) == longStr.charAt(j)) {
					return false;
				}
			}
		}

		return true;
	}
}
