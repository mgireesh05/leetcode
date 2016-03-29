package com.mgireesh;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> smap = new HashMap<Character, Character>();
		Map<Character, Character> tmap = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			Character skey = s.charAt(i);
			if (smap.containsKey(skey)) {
				if (t.charAt(i) != smap.get(skey)) {
					return false;
				}
			} else {
				smap.put(skey, t.charAt(i));
			}

			Character tkey = t.charAt(i);
			if (tmap.containsKey(tkey)) {
				if (s.charAt(i) != tmap.get(tkey)) {
					return false;
				}
			} else {
				tmap.put(tkey, s.charAt(i));
			}

		}
		return true;
	}
}
