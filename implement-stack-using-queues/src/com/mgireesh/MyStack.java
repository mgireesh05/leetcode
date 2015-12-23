package com.mgireesh;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	Queue<Integer> mainq = new LinkedList<Integer>();
	Queue<Integer> auxq = new LinkedList<Integer>();

	// Push element x onto stack.
	public void push(int x) {
		mainq.add(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		while (mainq.size() > 1) {
			auxq.add(mainq.remove());
		}
		mainq.remove();
		while (!auxq.isEmpty()) {
			mainq.add(auxq.remove());
		}
	}

	// Get the top element.
	public int top() {
		int val = 0;
		while (mainq.size() > 1) {
			auxq.add(mainq.remove());
		}
		val = mainq.peek();
		auxq.add(mainq.remove());
		while (!auxq.isEmpty()) {
			mainq.add(auxq.remove());
		}

		return val;
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return mainq.isEmpty();
	}
}
