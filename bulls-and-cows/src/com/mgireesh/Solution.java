package com.mgireesh;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public String getHint(String secret, String guess) {
		Integer bulls = 0;
		Integer cows = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < guess.length(); i++) {
			if (guess.charAt(i) == secret.charAt(i)) {
				bulls++;
			} else {
				Character key = secret.charAt(i);
				int count = 0;
				if (map.containsKey(key)) {
					count = map.get(key);
				}
				map.put(key, count + 1);
				sb.append(guess.charAt(i));
			}
		}

		for (int i = 0; i < sb.length(); i++) {
			Character key = sb.charAt(i);
			if (map.containsKey(key)) {
				int count = map.get(key);
				cows++;
				if (count - 1 == 0) {
					map.remove(key);
				} else {
					map.put(key, count - 1);
				}
			}
		}
		return bulls + "A" + cows + "B";
	}
}
