package com.mgireesh;

public class Solution {
	public int reverse(int x) {
		Integer xTemp = x;
		String sign = "";
		if (x < 0) {
			sign = "-";
			xTemp *= -1;
		}
		String xrStr = new StringBuilder(Integer.toString(xTemp)).reverse().toString();
		xrStr = sign + xrStr;
		try {
			xTemp = Integer.parseInt(xrStr);
		} catch (Exception e) {
			xTemp = 0;
		}
		return xTemp;
	}
}