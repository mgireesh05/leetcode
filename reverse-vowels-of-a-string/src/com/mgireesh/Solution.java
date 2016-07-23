package com.mgireesh;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public String reverseVowels(String s) {
		char[] str = s.toCharArray();
		Set<Character> set = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			while (i < j && !set.contains(str[i])) {
				i++;
			}
			while (j > i && !set.contains(str[j])) {
				j--;
			}
			char c = str[i];
			str[i] = str[j];
			str[j] = c;
			i++;
			j--;
		}
		return new String(str);
	}
}
