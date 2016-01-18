package com.mgireesh;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char c0 = stack.pop();
				if (c0 == '(' && c != ')') {
					return false;
				} else if (c0 == '{' && c != '}') {
					return false;
				} else if (c0 == '[' && c != ']') {
					return false;
				}
			}
		}

		if (!stack.isEmpty()) {
			return false;
		}

		return true;
	}
}