package com.mgireesh;

public class App {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(5);
		for (int i = 0; i < 10; i++) {
			cache.set(i, i + 10);
			cache.get(i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(cache.get(i));
		}
	}

}
