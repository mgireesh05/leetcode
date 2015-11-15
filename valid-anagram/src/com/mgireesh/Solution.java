package com.mgireesh;

import java.util.Arrays;

public class Solution {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		char arrS[] = s.toCharArray();
		Arrays.sort(arrS);
		String sortedS = String.valueOf(arrS);

		char arrT[] = t.toCharArray();
		Arrays.sort(arrT);
		String sortedT = String.valueOf(arrT);

		if (sortedS.equals(sortedT)) {
			return true;
		} else {
			return false;
		}

	}
}
