package com.mgireesh;

public class Solution extends VersionControl {
	public int firstBadVersion(int n) {
		int badVersion = 0;

		int start = 1;
		int end = n;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (isBadVersion(mid)) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
}