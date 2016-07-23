package com.mgireesh;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			s1.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			s2.add(nums2[i]);
		}

		s1.retainAll(s2);

		int[] intersection = new int[s1.size()];

		int i = 0;
		for (Integer val : s1) {
			intersection[i++] = val;
		}

		return intersection;
	}
}
