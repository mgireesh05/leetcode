package com.mgireesh;

public class App {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.top());
		stack.push(3);
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
	}

}
