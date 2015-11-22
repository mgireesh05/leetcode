package com.mgireesh;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
	private int cap;
	private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	private LinkedList<Integer> list = new LinkedList<Integer>();

	public LRUCache(int capacity) {
		cap = capacity;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			list.removeFirstOccurrence(key);
			list.addFirst(key);
			return map.get(key);
		} else {
			return -1;
		}
	}

	public void set(int key, int value) {
		if (map.containsKey(key)) {
			map.put(key, value);
			return;
		}
		if (map.size() < cap) {
			map.put(key, value);
			list.addLast(key);
		} else {
			Integer i = list.removeLast();
			map.remove(i);
			map.put(key, value);
			list.addLast(key);
		}
	}
}
