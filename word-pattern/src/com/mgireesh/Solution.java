package com.mgireesh;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public boolean wordPattern(String pattern, String str) {
		ArrayList<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		char c = ' ';
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c == ' ') {
				list.add(sb.toString());
				sb = new StringBuilder();
			} else {
				sb.append(c);
			}
		}
		list.add(sb.toString());

		if (list.size() != pattern.length()) {
			return false;
		}

		HashMap<Character, String> fwdMap = new HashMap<Character, String>();
		HashMap<String, Character> revMap = new HashMap<String, Character>();
		for (int i = 0; i < pattern.length(); i++) {
			Character fKey = pattern.charAt(i);
			String fVal = list.get(i);
			String rKey = list.get(i);
			Character rVal = pattern.charAt(i);

			if (fwdMap.containsKey(fKey)) {
				if (!fVal.equals(fwdMap.get(fKey))) {
					return false;
				}
			} else {
				fwdMap.put(fKey, fVal);
			}

			if (revMap.containsKey(rKey)) {
				if (!rVal.equals(revMap.get(rKey))) {
					return false;
				}
			} else {
				revMap.put(rKey, rVal);
			}

		}
		return true;
	}
}
