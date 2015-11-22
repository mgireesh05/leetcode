package com.mgireesh;

import java.util.HashMap;

public class LRUCache {
	private int cap;
	private ListNode head = null;
	private ListNode tail = null;
	private HashMap<Integer, ListNode> map = new HashMap<Integer, ListNode>();

	class ListNode {
		int key;
		int val;
		ListNode next;
		ListNode prev;

		ListNode(int x, int y) {
			key = x;
			val = y;
		}
	}

	public void addToHead(ListNode node) {
		if (node == null) {
			return;
		}

		if ((head == null) || (tail == null)) {
			head = tail = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}
	}

	public void removeNode(ListNode node) {
		if (node == null) {
			return;
		}

		if (node.prev != null) {
			node.prev.next = node.next;
		} else {
			head = head.next;
		}

		if (node.next != null) {
			node.next.prev = node.prev;
		} else {
			tail = node.prev;
		}

		node.next = null;
		node.prev = null;
	}

	public LRUCache(int capacity) {
		cap = capacity;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			ListNode node = map.get(key);
			removeNode(node);
			addToHead(node);
			return node.val;
		}
		return -1;
	}

	public void set(int key, int value) {
		if (map.containsKey(key)) {
			ListNode node = map.get(key);
			node.val = value;
			map.put(key, node);
			removeNode(node);
			addToHead(node);
		} else {

			ListNode node = new ListNode(key, value);
			if (map.size() < cap) {
				addToHead(node);
			} else {
				map.remove(tail.key);
				removeNode(tail);
				node.key = key;
				node.val = value;
				addToHead(node);
			}
			map.put(key, node);
		}
	}
}
