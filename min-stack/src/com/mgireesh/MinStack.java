package com.mgireesh;

import java.util.Stack;

public class MinStack {
	private int min = Integer.MAX_VALUE;
	private Stack<Integer> main = new Stack<Integer>();
	private Stack<Integer> aux = new Stack<Integer>();

	public void push(int x) {
		main.push(x);
		if (x < min) {
			min = x;
		}
		aux.push(min);
	}

	public void pop() {
		main.pop();
		aux.pop();
		if (!aux.isEmpty()) {
			min = aux.peek();
		} else {
			min = Integer.MAX_VALUE;
		}
	}

	public int top() {
		return main.peek();
	}

	public int getMin() {
		return aux.peek();
	}
}
