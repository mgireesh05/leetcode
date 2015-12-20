package com.mgireesh;

import java.util.Stack;

public class MyQueue {
	private Stack<Integer> mainStack = null;
	private Stack<Integer> auxStack = null;

	MyQueue() {
		mainStack = new Stack<Integer>();
		auxStack = new Stack<Integer>();
	}

	// Push element x to the back of queue.
	public void push(int x) {
		mainStack.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() {
		while (!mainStack.isEmpty()) {
			auxStack.push(mainStack.pop());
		}
		auxStack.pop();
		while (!auxStack.isEmpty()) {
			mainStack.push(auxStack.pop());
		}
	}

	// Get the front element.
	public int peek() {
		while (!mainStack.isEmpty()) {
			auxStack.push(mainStack.pop());
		}
		int ret = auxStack.peek();
		while (!auxStack.isEmpty()) {
			mainStack.push(auxStack.pop());
		}
		return ret;
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return mainStack.isEmpty();
	}
}
