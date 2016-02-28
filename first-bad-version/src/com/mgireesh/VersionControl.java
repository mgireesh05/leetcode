package com.mgireesh;

public class VersionControl {
	private int badVersion = 2; // (int) Math.floor(Math.random() * 10);

	VersionControl() {
		System.out.println("BadVersion=" + badVersion);
	}

	boolean isBadVersion(int version) {
		if (version >= badVersion) {
			return true;
		}
		return false;
	}
}
