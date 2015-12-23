package com.mgireesh;

import java.util.HashSet;

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

		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s1.length(); i++) {
			set.add(s1.charAt(i));
		}

		for (int i = 0; i < s2.length(); i++) {
			if (set.contains(s2.charAt(i))) {
				return false;
			}
		}

		return true;
	}
}
