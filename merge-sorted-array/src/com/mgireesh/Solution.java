package com.mgireesh;

import java.util.HashMap;

public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int index = 0;

		int i = 0;
		int j = 0;
		while (true) {
			if ((i == m) && (j < n)) {
				for (int k = j; k < n; k++) {
					map.put(index, nums2[k]);
					index++;
				}
				break;
			} else if ((j == n) && (i < m)) {
				for (int k = i; k < m; k++) {
					map.put(index, nums1[k]);
					index++;
				}
				break;
			} else {
				if (nums1[i] < nums2[j]) {
					map.put(index, nums1[i]);
					i++;
				} else {
					map.put(index, nums2[j]);
					j++;
				}
			}
			index++;
		}

		for (int k = 0; k < m + n; k++) {
			nums1[k] = map.get(k);
		}
	}
}
