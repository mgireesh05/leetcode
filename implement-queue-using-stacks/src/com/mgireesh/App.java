package com.mgireesh;

public class App {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.push(1);
		q.push(2);
		q.push(3);

		System.out.println(q.peek());
		q.pop();
		System.out.println(q.peek());
	}

}
