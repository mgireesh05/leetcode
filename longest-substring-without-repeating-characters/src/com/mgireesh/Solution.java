package com.mgireesh;

import java.util.HashMap;

public class Solution {

	public int lengthOfLongestSubstring(String s) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		if (s == null || s.length() == 0) {
			return 0;
		}

		if (s.length() == 1) {
			return 1;
		}

		int rightPointer = 0;
		int leftPointer = rightPointer - 1;
		int answer = 0;

		while (rightPointer != s.length()) {
			Integer previousOccurrence = map.put(s.charAt(rightPointer), rightPointer);

			if (previousOccurrence != null) {
				leftPointer = Math.max(leftPointer, previousOccurrence);
			}
			answer = Math.max(answer, rightPointer - leftPointer);
			rightPointer++;
		}

		return answer;
	}

	public String longestSubstring(String s) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		if (s == null || s.length() <= 1) {
			return s;
		}

		int rightPointer = 0;
		int leftPointer = rightPointer - 1;
		int answer = 0;
		int start = 0;
		int index = 0;

		while (rightPointer != s.length()) {
			Integer previousOccurrence = map.put(s.charAt(rightPointer), rightPointer);

			if (previousOccurrence != null) {
				leftPointer = Math.max(leftPointer, previousOccurrence);
			}
			answer = Math.max(answer, rightPointer - leftPointer);

			if ((start + answer) != index) {
				start = index - (answer - 1);
			}

			rightPointer++;
			index++;
		}

		return s.substring(start, start + answer);
	}

}