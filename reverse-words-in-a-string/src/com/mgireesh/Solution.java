package com.mgireesh;

import java.util.ArrayList;

public class Solution {
	public String reverseWords(String s) {
		ArrayList<String> arr = new ArrayList<String>();
		boolean building = false;
		StringBuilder sb = null;
		if (s.length() < 1) {
			return s;
		}
		for (int i = 0; i < s.length(); i++) {
			if (!building) {
				if (s.charAt(i) != ' ') {
					sb = new StringBuilder();
					sb.append(s.charAt(i));
					building = true;
				}
			} else {
				if (s.charAt(i) == ' ') {
					arr.add(0, sb.toString());
					building = false;
				} else {
					sb.append(s.charAt(i));
				}
			}
		}

		if (building) {
			arr.add(0, sb.toString());
		}

		sb = new StringBuilder();
		for (int i = 0; i < arr.size(); i++) {
			sb.append(arr.get(i));
			if (i != arr.size() - 1) {
				sb.append(' ');
			}
		}
		return sb.toString();
	}
}
