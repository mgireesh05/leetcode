package com.mgireesh;

public class Solution {

	public int lengthOfLongestSubstring(String s) {
		int maxLen = 1;
		int maxStartIdx = 0;
		int curStartIdx = 0;
		int curLen = 1;

		if (s.length() <= 1) {
			return s.length();
		}

		String sTemp = s.substring(0, 1);

		for (int i = 1; i < s.length(); i++) {
			char newChar = s.charAt(i);
			int found = sTemp.indexOf(newChar);
			if (found < 0) {
				curLen++;
			} else {
				if (curLen > maxLen) {
					maxStartIdx = curStartIdx = sTemp.indexOf(newChar) + 1;
					maxLen = curLen;
				} else {
					curLen = 0;
					curStartIdx = sTemp.indexOf(newChar);
				}
			}
			sTemp = s.substring(0, i + 1);
		}

		if (curLen > maxLen) {
			maxStartIdx = curStartIdx;
			maxLen = curLen;
		}

		// System.out.println(s.substring(maxStartIdx, maxStartIdx + maxLen));
		return maxLen;
	}
}