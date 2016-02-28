package com.mgireesh;

public class App {
	public static void main(String[] args) {
		MinStack ms = new MinStack();

		ms.push(-10);
		ms.push(14);
		System.out.println(ms.getMin());
		System.out.println(ms.getMin());
		ms.push(-20);
		System.out.println(ms.getMin());
		System.out.println(ms.getMin());
		System.out.println(ms.top());
		System.out.println(ms.getMin());
		ms.pop();
		ms.push(10);
		ms.push(-7);
		System.out.println(ms.getMin());
		ms.push(-7);
		ms.pop();
		System.out.println(ms.top());
		System.out.println(ms.getMin());
		ms.pop();
	}
}
